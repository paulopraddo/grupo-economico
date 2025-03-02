package personal.project.grupo_economico.app.grupoEconomico.provider;

import java.util.List;

import personal.project.grupo_economico.app.grupoEconomico.provider.entity.GrupoEconomicoEntity;
import personal.project.grupo_economico.app.grupoEconomico.restModels.UpdateGrupoEconomicoNomeDto;

public interface GrupoEconomicoDataProvider {

    void uploadGrupoEconomico(GrupoEconomicoEntity entity);

    GrupoEconomicoEntity getGrupoEconomicoEntityFindByName(String nome);

    List<GrupoEconomicoEntity> getListOfGrupoEconomicoEntity();

    void updateGrupoEconomicoNome(UpdateGrupoEconomicoNomeDto dto);

    void deleteGrupoEconomicoEntityById(String id);
    
}
