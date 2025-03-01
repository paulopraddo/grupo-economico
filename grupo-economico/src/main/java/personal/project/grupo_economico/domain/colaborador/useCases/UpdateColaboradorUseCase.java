package personal.project.grupo_economico.domain.colaborador.useCases;

import personal.project.grupo_economico.app.colaborador.restModels.UpdateColaboradorRestModel;

public interface UpdateColaboradorUseCase {
    void execute(UpdateColaboradorRestModel restModel);
}
