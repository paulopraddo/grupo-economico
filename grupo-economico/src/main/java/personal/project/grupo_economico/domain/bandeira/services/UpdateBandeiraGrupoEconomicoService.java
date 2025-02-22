package personal.project.grupo_economico.domain.bandeira.services;

import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.bandeira.provider.BandeiraDataProvider;
import personal.project.grupo_economico.app.bandeira.restModels.UpdateBandeiraGrupoEconomicoRestModel;
import personal.project.grupo_economico.domain.bandeira.useCases.UpdateBandeiraGrupoEconomicoUseCase;

@Service
@AllArgsConstructor
public class UpdateBandeiraGrupoEconomicoService implements UpdateBandeiraGrupoEconomicoUseCase {

    private final BandeiraDataProvider dataProvider;

    @Override
    public void execute(UpdateBandeiraGrupoEconomicoRestModel restModel) {
        int validate = this.dataProvider.updateBandeiraEntityGrupoEconomico(restModel);
        
        if(validate == 0) {
            throw new RuntimeException("Não foi possivel atualizar o grupo economico");
        
        }
    }

}
