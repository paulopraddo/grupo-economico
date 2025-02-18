package personal.project.grupo_economico.domain.bandeira.converters;

import personal.project.grupo_economico.app.bandeira.provider.entity.BandeiraEntity;
import personal.project.grupo_economico.app.bandeira.restModels.UploadBandeiraRestModel;
import personal.project.grupo_economico.utils.ModelEntityMapper;

public class UploadBandeiraRestModelToBandeiraEntity extends ModelEntityMapper<BandeiraEntity, UploadBandeiraRestModel>{

    @Override
    public UploadBandeiraRestModel convertToRestModel(BandeiraEntity entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'convertToRestModel'");
    }

    @Override
    public BandeiraEntity convertToEntity(UploadBandeiraRestModel model) {
        return BandeiraEntity
        .builder()
        .nome(model.getNome())
        .build();
    }

}
