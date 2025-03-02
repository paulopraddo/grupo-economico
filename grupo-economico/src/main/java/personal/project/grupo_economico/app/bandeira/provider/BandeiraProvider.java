package personal.project.grupo_economico.app.bandeira.provider;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.bandeira.provider.entity.BandeiraEntity;
import personal.project.grupo_economico.app.bandeira.repository.BandeiraRepository;
import personal.project.grupo_economico.app.bandeira.restModels.UpdateBandeiraGrupoEconomicoRestModel;
import personal.project.grupo_economico.app.bandeira.restModels.UpdateBandeiraNomeRestModel;

@Component
@AllArgsConstructor
public class BandeiraProvider implements BandeiraDataProvider {

    private final BandeiraRepository repository;
    
    @Override
    public void uploadBandeira(BandeiraEntity entity) {
        this.repository.save(entity);
    }

    @Override
    public BandeiraEntity getBandeiraEntity(String nome) {
        return this.repository.findByNome(nome);
    }

    @Override
    public List<BandeiraEntity> getAllBandeiraEntitys() {
        return this.repository.findAll();
    }

    @Override
    public void updateBandeiraEntityNome(UpdateBandeiraNomeRestModel restModel) {

        BandeiraEntity entity = this.getBandeiraEntity(restModel.getId());
        
        entity.setNome(restModel.getNome());

        this.repository.save(entity);
    }

    @Override
    public int updateBandeiraEntityGrupoEconomico(UpdateBandeiraGrupoEconomicoRestModel restModel) {
        return this.repository.atualizarGrupoEconomico(restModel.getId(), restModel.getGrupoEconomicoId());
    }

    @Override
    public void deleteBandeira(String id) {
        this.repository.deleteById(id);
    }

}
