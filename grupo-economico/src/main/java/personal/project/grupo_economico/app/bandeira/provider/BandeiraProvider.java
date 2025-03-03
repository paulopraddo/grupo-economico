package personal.project.grupo_economico.app.bandeira.provider;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.bandeira.provider.entity.BandeiraEntity;
import personal.project.grupo_economico.app.bandeira.repository.BandeiraRepository;
import personal.project.grupo_economico.app.bandeira.restModels.UpdateBandeiraDto;
import personal.project.grupo_economico.app.grupoEconomico.provider.entity.GrupoEconomicoEntity;

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
    public void updateBandeiraEntity(UpdateBandeiraDto dto) {

        BandeiraEntity entity = this.getBandeiraEntity(dto.getNome());
        
        entity.setNome(dto.getNewNome());
        entity.setGrupoEconomico(GrupoEconomicoEntity.builder().id(dto.getGrupoEconomicoId()).build());

        this.repository.save(entity);
    }

    @Override
    public void deleteBandeira(String id) {
        this.repository.deleteById(id);
    }

}
