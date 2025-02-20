package personal.project.grupo_economico.domain.bandeira.useCases;

import personal.project.grupo_economico.app.bandeira.restModels.UpdateBandeiraRestModel;

public interface UpdateBandeiraUseCase {
    void execute(UpdateBandeiraRestModel restModel);
}
