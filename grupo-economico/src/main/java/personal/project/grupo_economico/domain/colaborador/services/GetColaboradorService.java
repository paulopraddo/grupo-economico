package personal.project.grupo_economico.domain.colaborador.services;

import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.colaborador.provider.ColaboradorDataProvider;
import personal.project.grupo_economico.app.colaborador.provider.entity.ColaboradorEntity;
import personal.project.grupo_economico.app.colaborador.restModels.GetColaboradorRestModel;
import personal.project.grupo_economico.domain.colaborador.converters.ColaboradorEntityToGetColaboradorRestModel;
import personal.project.grupo_economico.domain.colaborador.useCases.GetColaboradorUseCase;

@Service
@AllArgsConstructor
public class GetColaboradorService implements GetColaboradorUseCase {
    
    private final ColaboradorDataProvider dataProvider;
    private final ColaboradorEntityToGetColaboradorRestModel converter;

    @Override
    public GetColaboradorRestModel execute(String id) {
        ColaboradorEntity entity = this.dataProvider.getColaborador(id);

        if(entity == null) {
            throw new EntityNotFoundException("Não foi possivel encontrar o registro de colaborador");
        }

        return this.converter.convertToRestModel(entity);
    }

}
