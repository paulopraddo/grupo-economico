package personal.project.grupo_economico.app.colaborador.provider;

import java.util.List;

import personal.project.grupo_economico.app.colaborador.provider.entity.ColaboradorEntity;
import personal.project.grupo_economico.app.colaborador.restModels.UpdateColaboradorRestModel;

public interface ColaboradorDataProvider {

    void uploadColaborador(ColaboradorEntity entity);

    ColaboradorEntity getColaborador(String nome);

    List<ColaboradorEntity> getListOfColaborador();

    void updateColaborador(UpdateColaboradorRestModel restModel);

    void deleteColaborador(String id);
}
