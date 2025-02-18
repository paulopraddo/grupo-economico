package personal.project.grupo_economico.domain.grupoEconomico.useCases;

import personal.project.grupo_economico.app.grupoEconomico.restModels.GetGrupoEconomicoRestModel;

public interface GetGrupoEconomicoUseCase {

    GetGrupoEconomicoRestModel execute(String id);
}
