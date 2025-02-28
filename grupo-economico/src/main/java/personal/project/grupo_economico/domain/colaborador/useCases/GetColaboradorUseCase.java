package personal.project.grupo_economico.domain.colaborador.useCases;

import personal.project.grupo_economico.app.colaborador.restModels.GetColaboradorRestModel;

public interface GetColaboradorUseCase {
    GetColaboradorRestModel execute(String id);
}
