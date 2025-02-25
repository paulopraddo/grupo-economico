package personal.project.grupo_economico.domain.unidade.useCases;

import java.util.List;

import personal.project.grupo_economico.app.unidade.restModels.GetUnidadeRestModel;

public interface GetListOfUnidadeUseCase {
    List<GetUnidadeRestModel> execute();
}
