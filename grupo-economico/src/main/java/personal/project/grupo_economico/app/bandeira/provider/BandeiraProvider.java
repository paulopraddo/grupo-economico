package personal.project.grupo_economico.app.bandeira.provider;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.bandeira.provider.entity.BandeiraEntity;
import personal.project.grupo_economico.app.bandeira.repository.BandeiraRepository;

@Component
@AllArgsConstructor
public class BandeiraProvider implements BandeiraDataProvider {

    private final BandeiraRepository repository;
    
    @Override
    public void uploadBandeira(BandeiraEntity entity) {
        this.repository.save(entity);
    }

    @Override
    public BandeiraEntity getBandeiraEntity(String id) {
        return this.repository.findById(id).orElse(null);
    }

    @Override
    public void updateBandeiraEntity(BandeiraEntity restModel) {

        BandeiraEntity entity = this.getBandeiraEntity(restModel.getId());
        
        entity.setNome(restModel.getNome());
        entity.setGrupoEconomico(null);

        this.repository.save(entity);
    }

}
