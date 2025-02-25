package personal.project.grupo_economico.app.unidade.provider;

import java.util.List;

import personal.project.grupo_economico.app.unidade.provider.entity.UnidadeEntity;

public interface UnidadeDataProvider {

    void uploadUnidade(UnidadeEntity entity);

    UnidadeEntity getUnidade(String id);

    List<UnidadeEntity> getListOfUnidade();
}
