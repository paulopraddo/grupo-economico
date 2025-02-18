package personal.project.grupo_economico.domain.grupoEconomico.useCases;

import java.util.List;

import personal.project.grupo_economico.app.grupoEconomico.restModels.GetGrupoEconomicoRestModel;

public interface GetAllGrupoEconomicoUseCase {

    List<GetGrupoEconomicoRestModel> execute();
}
