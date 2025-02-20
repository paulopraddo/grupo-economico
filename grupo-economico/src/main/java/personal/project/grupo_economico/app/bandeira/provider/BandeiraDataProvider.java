package personal.project.grupo_economico.app.bandeira.provider;

import personal.project.grupo_economico.app.bandeira.provider.entity.BandeiraEntity;

public interface BandeiraDataProvider {

    void uploadBandeira(BandeiraEntity entity);

    BandeiraEntity getBandeiraEntity(String id);

    void updateBandeiraEntity(BandeiraEntity entity);
}
