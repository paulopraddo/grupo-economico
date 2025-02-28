package personal.project.grupo_economico.domain.colaborador.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.colaborador.provider.ColaboradorDataProvider;
import personal.project.grupo_economico.app.colaborador.provider.entity.ColaboradorEntity;
import personal.project.grupo_economico.app.colaborador.restModels.GetColaboradorRestModel;
import personal.project.grupo_economico.domain.colaborador.converters.ColaboradorEntityToGetColaboradorRestModel;
import personal.project.grupo_economico.domain.colaborador.useCases.GetListOfColaboradorUseCase;

@Service
@AllArgsConstructor
public class GetListOfColaboradorService implements GetListOfColaboradorUseCase {

    private final ColaboradorDataProvider dataProvider;
    private final ColaboradorEntityToGetColaboradorRestModel converter;
    
    @Override
    public List<GetColaboradorRestModel> execute() {
        List<ColaboradorEntity> entityList = this.dataProvider.getListOfColaborador();

        return entityList.stream()
        .map(converter::convertToRestModel)
        .collect(Collectors.toList());
    }

}
