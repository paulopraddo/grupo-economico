package personal.project.grupo_economico.app.colaborador.provider;

import java.util.List;

import personal.project.grupo_economico.app.colaborador.provider.entity.ColaboradorEntity;

public interface ColaboradorDataProvider {

    void uploadColaborador(ColaboradorEntity entity);

    ColaboradorEntity getColaborador(String id);

    List<ColaboradorEntity> getListOfColaborador();
}
