package personal.project.grupo_economico.domain.colaborador.useCases;

import java.util.List;

import personal.project.grupo_economico.app.colaborador.restModels.GetColaboradorRestModel;

public interface GetListOfColaboradorUseCase {
    List<GetColaboradorRestModel> execute();
}
