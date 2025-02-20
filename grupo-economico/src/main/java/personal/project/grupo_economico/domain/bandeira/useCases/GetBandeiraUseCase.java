package personal.project.grupo_economico.domain.bandeira.useCases;

import personal.project.grupo_economico.app.bandeira.restModels.GetBandeiraRestModel;

public interface GetBandeiraUseCase {
    GetBandeiraRestModel execute(String id);
}
