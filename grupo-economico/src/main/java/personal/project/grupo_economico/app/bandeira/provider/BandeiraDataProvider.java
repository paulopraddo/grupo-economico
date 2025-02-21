package personal.project.grupo_economico.app.bandeira.provider;

import personal.project.grupo_economico.app.bandeira.provider.entity.BandeiraEntity;
import personal.project.grupo_economico.app.bandeira.restModels.UpdateBandeiraGrupoEconomicoRestModel;
import personal.project.grupo_economico.app.bandeira.restModels.UpdateBandeiraNomeRestModel;

public interface BandeiraDataProvider {

    void uploadBandeira(BandeiraEntity entity);

    BandeiraEntity getBandeiraEntity(String id);

    void updateBandeiraEntityNome(UpdateBandeiraNomeRestModel restModel);
    
    int updateBandeiraEntityGrupoEconomico(UpdateBandeiraGrupoEconomicoRestModel restModel);
}
