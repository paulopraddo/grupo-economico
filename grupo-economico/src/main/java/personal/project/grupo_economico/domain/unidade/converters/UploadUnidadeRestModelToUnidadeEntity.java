package personal.project.grupo_economico.domain.unidade.converters;

import org.springframework.stereotype.Component;

import personal.project.grupo_economico.app.bandeira.provider.entity.BandeiraEntity;
import personal.project.grupo_economico.app.unidade.provider.entity.UnidadeEntity;
import personal.project.grupo_economico.app.unidade.restModels.UploadUnidadeRestModel;
import personal.project.grupo_economico.utils.ModelEntityMapper;

@Component
public class UploadUnidadeRestModelToUnidadeEntity extends ModelEntityMapper<UnidadeEntity, UploadUnidadeRestModel> {

    @Override
    public UploadUnidadeRestModel convertToRestModel(UnidadeEntity entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'convertToRestModel'");
    }

    @Override
    public UnidadeEntity convertToEntity(UploadUnidadeRestModel model) {
        return UnidadeEntity.builder()
        .nomeFantasia(model.getNomeFantasia())
        .razaoSocial(model.getRazaoSocial())
        .cnpj(model.getCnpj())
        .bandeira(BandeiraEntity.builder()
            .id(model.getBandeiraId())
            .build())
        .build();
    }

}
