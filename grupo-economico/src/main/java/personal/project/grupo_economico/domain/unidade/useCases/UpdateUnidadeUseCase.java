package personal.project.grupo_economico.domain.unidade.useCases;

import personal.project.grupo_economico.app.unidade.restModels.UpdateUnidadeRestModel;

public interface UpdateUnidadeUseCase {
    void execute(UpdateUnidadeRestModel restModel);
}
