package personal.project.grupo_economico.domain.colaborador.converters;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.colaborador.provider.entity.ColaboradorEntity;
import personal.project.grupo_economico.app.colaborador.restModels.UploadColaboradorRestModel;
import personal.project.grupo_economico.app.unidade.provider.entity.UnidadeEntity;
import personal.project.grupo_economico.utils.ModelEntityMapper;

@Component
@AllArgsConstructor
public class UploadColaboradorRestModelToColaboradorEntity extends ModelEntityMapper<ColaboradorEntity, UploadColaboradorRestModel> {@Override
    
    public UploadColaboradorRestModel convertToRestModel(ColaboradorEntity entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'convertToRestModel'");
    }

    @Override
    public ColaboradorEntity convertToEntity(UploadColaboradorRestModel model) {
        return ColaboradorEntity.builder()
        .nome(model.getNome())
        .email(model.getEmail())
        .cpf(model.getCpf())
        .unidade(UnidadeEntity.builder().id(model.getUnidadeId()).build())
        .build();
    }

}
