package personal.project.grupo_economico.domain.grupoEconomico.converters;

import org.springframework.stereotype.Component;

import personal.project.grupo_economico.app.grupoEconomico.provider.entity.GrupoEconomicoEntity;
import personal.project.grupo_economico.app.grupoEconomico.restModels.UploadGrupoEconomicoRestModel;
import personal.project.grupo_economico.utils.ModelEntityMapper;

@Component
public class UploadGrupoEconomicoRestModelToGrupoEconomicoEntity extends ModelEntityMapper<GrupoEconomicoEntity, UploadGrupoEconomicoRestModel> {

    @Override
    public UploadGrupoEconomicoRestModel convertToRestModel(GrupoEconomicoEntity entity) {

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'convertToModel'");
    }

    @Override
    public GrupoEconomicoEntity convertToEntity(UploadGrupoEconomicoRestModel model) {
        return GrupoEconomicoEntity.builder()
        .nome(model.getNome()).build();
    }



}
