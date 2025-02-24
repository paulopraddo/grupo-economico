package personal.project.grupo_economico.domain.unidade.useCases;

import personal.project.grupo_economico.app.unidade.restModels.UploadUnidadeRestModel;

public interface UploadUnidadeUseCase {
    void execute(UploadUnidadeRestModel restModel);
}
