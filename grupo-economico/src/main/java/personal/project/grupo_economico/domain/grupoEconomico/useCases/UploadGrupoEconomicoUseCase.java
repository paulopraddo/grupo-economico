package personal.project.grupo_economico.domain.grupoEconomico.useCases;

import personal.project.grupo_economico.app.grupoEconomico.restModels.UploadGrupoEconomicoRestModel;

public interface UploadGrupoEconomicoUseCase {

    void execute(UploadGrupoEconomicoRestModel restModel);
}
