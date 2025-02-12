package personal.project.grupo_economico.useCases;

import personal.project.grupo_economico.dtos.GetGrupoEconomicoRestModel;

public interface GetGrupoEconomicoUseCase {

    GetGrupoEconomicoRestModel execute(String id);
}
