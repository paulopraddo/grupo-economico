package personal.project.grupo_economico.domain.bandeira.converters;

import org.springframework.stereotype.Component;

import personal.project.grupo_economico.app.bandeira.provider.entity.BandeiraEntity;
import personal.project.grupo_economico.app.bandeira.restModels.GetBandeiraRestModel;
import personal.project.grupo_economico.utils.ModelEntityMapper;

@Component
public class BandeiraEntityToGetBandeiraRestModel extends ModelEntityMapper<BandeiraEntity, GetBandeiraRestModel>{

    @Override
    public GetBandeiraRestModel convertToRestModel(BandeiraEntity entity) {
        return GetBandeiraRestModel.builder()
        .nome(entity.getNome())
        .nomeGrupoEconomico(entity.getGrupoEconomico().getNome())
        .dataDeCriacao(entity.getDataDeCriacao())
        .dataDeUltimaAtualizacao(entity.getUltimaAtualizacao())
        .build();
    }

    @Override
    public BandeiraEntity convertToEntity(GetBandeiraRestModel model) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'convertToEntity'");
    }

}
