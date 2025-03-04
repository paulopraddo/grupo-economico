package personal.project.grupo_economico.app.unidade.provider;

import java.util.List;

import personal.project.grupo_economico.app.unidade.provider.entity.UnidadeEntity;
import personal.project.grupo_economico.app.unidade.restModels.UpdateUnidadeRestModel;

public interface UnidadeDataProvider {

    void uploadUnidade(UnidadeEntity entity);

    UnidadeEntity getUnidade(String nome);

    List<UnidadeEntity> getListOfUnidade();

    void updateUnidade(UpdateUnidadeRestModel restModel);

    void deleteUnidade(String id);
}
