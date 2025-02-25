package personal.project.grupo_economico.domain.unidade.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.unidade.provider.UnidadeDataProvider;
import personal.project.grupo_economico.app.unidade.provider.entity.UnidadeEntity;
import personal.project.grupo_economico.app.unidade.restModels.GetUnidadeRestModel;
import personal.project.grupo_economico.domain.unidade.converters.UnidadeEntityToGetUnidadeRestModel;
import personal.project.grupo_economico.domain.unidade.useCases.GetListOfUnidadeUseCase;

@Service
@AllArgsConstructor
public class GetListOfUnidadeService implements GetListOfUnidadeUseCase{

    private final UnidadeDataProvider dataProvider;
    private final UnidadeEntityToGetUnidadeRestModel converter;
    @Override
    public List<GetUnidadeRestModel> execute() {

        List<UnidadeEntity> entityList = this.dataProvider.getListOfUnidade();

        if (entityList.isEmpty()) {
            throw new RuntimeException("Nenhum registro foi encontrado");
        }

        return entityList.stream()
        .map(converter :: convertToRestModel)
        .collect(Collectors.toList());
    }
}
