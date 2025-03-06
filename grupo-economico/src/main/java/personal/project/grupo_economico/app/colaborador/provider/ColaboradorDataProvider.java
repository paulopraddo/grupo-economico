package personal.project.grupo_economico.app.colaborador.provider;

import java.util.List;

import personal.project.grupo_economico.app.colaborador.provider.entity.ColaboradorEntity;
import personal.project.grupo_economico.app.colaborador.restModels.UpdateColaboradorDto;

public interface ColaboradorDataProvider {

    void uploadColaborador(ColaboradorEntity entity);

    ColaboradorEntity getColaborador(String nome);

    List<ColaboradorEntity> getListOfColaborador();

    void updateColaborador(UpdateColaboradorDto restModel);

    void deleteColaborador(String id);
}
