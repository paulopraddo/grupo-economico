package personal.project.grupo_economico.domain.bandeira.services;

import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.bandeira.provider.BandeiraDataProvider;
import personal.project.grupo_economico.app.bandeira.provider.entity.BandeiraEntity;
import personal.project.grupo_economico.app.bandeira.restModels.UpdateBandeiraDto;
import personal.project.grupo_economico.domain.bandeira.useCases.UpdateBandeiraNomeUseCase;

@Service
@AllArgsConstructor
public class UpdateBandeiraNomeService implements UpdateBandeiraNomeUseCase {

    private final BandeiraDataProvider bandeiraDataProvider;
    
    @Override
    public void execute(UpdateBandeiraDto dto) {

        BandeiraEntity entity = this.bandeiraDataProvider.getBandeiraEntity(dto.getNome());

        if(entity == null) {
            throw new EntityNotFoundException("A bandeira especificada não foi encontrada");
        }
        
        this.bandeiraDataProvider.updateBandeiraEntity(dto);
    }

    

}
