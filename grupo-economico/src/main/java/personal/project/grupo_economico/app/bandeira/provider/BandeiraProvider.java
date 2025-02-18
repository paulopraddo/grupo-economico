package personal.project.grupo_economico.app.bandeira.provider.entity;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.bandeira.provider.BandeiraDataProvider;
import personal.project.grupo_economico.app.grupoEconomico.repositories.BandeiraRepository;

@Component
@AllArgsConstructor
public class BandeiraProvider implements BandeiraDataProvider {

    private final BandeiraRepository repository;
    
    @Override
    public void updateBandeiraEntity(BandeiraEntity entity) {
        this.repository.save(entity);
    }

}
