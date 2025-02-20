package personal.project.grupo_economico.domain.bandeira.services;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.bandeira.provider.BandeiraDataProvider;
import personal.project.grupo_economico.app.bandeira.restModels.UpdateBandeiraRestModel;
import personal.project.grupo_economico.app.grupoEconomico.provider.GrupoEconomicoDataProvider;
import personal.project.grupo_economico.domain.bandeira.useCases.UpdateBandeiraUseCase;

@Service
@AllArgsConstructor
public class UpdateBandeiraService implements UpdateBandeiraUseCase {

    private final BandeiraDataProvider bandeiraDataProvider;
    private final GrupoEconomicoDataProvider grupoEconomicoDataProvider;
    
    @Override
    public void execute(UpdateBandeiraRestModel restModel) {

        this.grupoEconomicoDataProvider.getGrupoEconomicoEntityById(restModel.getGrupoEconomicoId());
        
        this.bandeiraDataProvider.updateBandeiraEntity(bandeiraDataProvider.getBandeiraEntity(restModel.getId()));
    }

    

}
