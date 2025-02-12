package personal.project.grupo_economico.useCases;

import java.util.List;

import personal.project.grupo_economico.dtos.GetGrupoEconomicoRestModel;

public interface GetAllGrupoEconomicoUseCase {

    List<GetGrupoEconomicoRestModel> execute();
}
