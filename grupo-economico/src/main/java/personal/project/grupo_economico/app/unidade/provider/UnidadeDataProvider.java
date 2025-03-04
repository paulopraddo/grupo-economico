package personal.project.grupo_economico.app.unidade.provider;

import java.util.List;

import personal.project.grupo_economico.app.unidade.provider.entity.UnidadeEntity;
import personal.project.grupo_economico.app.unidade.restModels.UpdateUnidadeDto;

public interface UnidadeDataProvider {

    void uploadUnidade(UnidadeEntity entity);

    UnidadeEntity getUnidade(String nome);

    List<UnidadeEntity> getListOfUnidade();

    void updateUnidade(UpdateUnidadeDto dto);

    void deleteUnidade(String id);
}
