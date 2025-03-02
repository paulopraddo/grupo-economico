package personal.project.grupo_economico.app.grupoEconomico.provider;

import java.util.List;

import personal.project.grupo_economico.app.grupoEconomico.provider.entity.GrupoEconomicoEntity;
import personal.project.grupo_economico.app.grupoEconomico.restModels.UpdateGrupoEconomicoNomeDto;

public interface GrupoEconomicoDataProvider {

    void uploadGrupoEconomico(GrupoEconomicoEntity entity);

    GrupoEconomicoEntity getGrupoEconomicoEntity(String nome);

    List<GrupoEconomicoEntity> getListOfGrupoEconomicoEntity();

    void updateGrupoEconomicoNome(UpdateGrupoEconomicoNomeDto dto);

    void deleteGrupoEconomico(String nome);
    
}
