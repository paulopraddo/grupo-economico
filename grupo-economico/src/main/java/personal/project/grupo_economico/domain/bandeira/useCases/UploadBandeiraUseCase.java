package personal.project.grupo_economico.domain.bandeira.useCases;

import personal.project.grupo_economico.app.bandeira.restModels.UploadBandeiraRestModel;

public interface UploadBandeiraUseCase {
    void execute(UploadBandeiraRestModel restModel);
}
