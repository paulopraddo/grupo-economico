package personal.project.grupo_economico.domain.bandeira.useCases;

import java.util.List;

import personal.project.grupo_economico.app.bandeira.restModels.GetBandeiraRestModel;

public interface GetAllBandeirasUseCase {
    List<GetBandeiraRestModel> execute();
}
