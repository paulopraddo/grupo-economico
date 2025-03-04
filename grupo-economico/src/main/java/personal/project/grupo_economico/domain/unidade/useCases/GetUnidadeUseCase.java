package personal.project.grupo_economico.domain.unidade.useCases;

import personal.project.grupo_economico.app.unidade.restModels.GetUnidadeRestModel;

public interface GetUnidadeUseCase {
    GetUnidadeRestModel execute(String nome);
}
