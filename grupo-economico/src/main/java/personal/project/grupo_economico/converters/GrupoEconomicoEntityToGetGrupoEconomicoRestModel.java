package personal.project.grupo_economico.converters;

import org.springframework.stereotype.Component;

import personal.project.grupo_economico.entitys.GrupoEconomicoEntity;
import personal.project.grupo_economico.restModels.GetGrupoEconomicoRestModel;
import personal.project.grupo_economico.utils.ModelEntityMapper;

@Component
public class GrupoEconomicoEntityToGetGrupoEconomicoRestModel extends ModelEntityMapper<GrupoEconomicoEntity, GetGrupoEconomicoRestModel>{

    @Override
    public GetGrupoEconomicoRestModel convertToRestModel(GrupoEconomicoEntity entity) {
        return GetGrupoEconomicoRestModel.builder()
        .nome(entity.getNome())
        .dataDeCriacao(entity.getDataDeCriacao())
        .dataDeUltimaAtualizacao(entity.getUltimaAtualizacao()).build();
    }

    @Override
    public GrupoEconomicoEntity convertToEntity(GetGrupoEconomicoRestModel model) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'convertToEntity'");
    }

}
