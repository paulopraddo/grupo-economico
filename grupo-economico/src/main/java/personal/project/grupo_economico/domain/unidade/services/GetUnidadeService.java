package personal.project.grupo_economico.domain.unidade.services;

import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.unidade.provider.UnidadeDataProvider;
import personal.project.grupo_economico.app.unidade.provider.entity.UnidadeEntity;
import personal.project.grupo_economico.app.unidade.restModels.GetUnidadeRestModel;
import personal.project.grupo_economico.domain.unidade.converters.UnidadeEntityToGetUnidadeRestModel;
import personal.project.grupo_economico.domain.unidade.useCases.GetUnidadeUseCase;

@Service
@AllArgsConstructor
public class GetUnidadeService implements GetUnidadeUseCase {

    private final UnidadeDataProvider dataProvider;
    private final UnidadeEntityToGetUnidadeRestModel converter;

    @Override
    public GetUnidadeRestModel execute(String id) {
        
        UnidadeEntity entity = this.dataProvider.getUnidade(id);

        if(entity == null) {
            throw new EntityNotFoundException("Não foi possivel encontrar uma unidade correspondente ao ID inserido");
        }

        return this.converter.convertToRestModel(entity);
    }

}
