package personal.project.grupo_economico.domain.colaborador.useCases;

import personal.project.grupo_economico.app.colaborador.restModels.UploadColaboradorRestModel;

public interface UploadColaboradorUseCase {
    void execute(UploadColaboradorRestModel restModel);
}
