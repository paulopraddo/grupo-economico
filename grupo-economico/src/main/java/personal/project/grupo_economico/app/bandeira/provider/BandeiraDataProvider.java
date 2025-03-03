package personal.project.grupo_economico.app.bandeira.provider;

import java.util.List;

import personal.project.grupo_economico.app.bandeira.provider.entity.BandeiraEntity;
import personal.project.grupo_economico.app.bandeira.restModels.UpdateBandeiraDto;

public interface BandeiraDataProvider {

    void uploadBandeira(BandeiraEntity entity);

    BandeiraEntity getBandeiraEntity(String nome);

    List<BandeiraEntity> getAllBandeiraEntitys();

    void updateBandeiraEntity(UpdateBandeiraDto dto);
    
    void deleteBandeira(String nome);
}
