package personal.project.grupo_economico.app.colaborador.provider;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.colaborador.provider.entity.ColaboradorEntity;
import personal.project.grupo_economico.app.grupoEconomico.repository.ColaboradroRepository;

@Component
@AllArgsConstructor
public class ColaboradorProvider implements ColaboradorDataProvider {

    private final ColaboradroRepository repository;

    @Override
    public void uploadColaborador(ColaboradorEntity entity) {
        this.repository.save(entity);
    }

    @Override
    public ColaboradorEntity getColaborador(String id) {
        return this.repository.findById(id).orElse(null);
    }

    @Override
    public List<ColaboradorEntity> getListOfColaborador() {
        return this.repository.findAll();
    }

}
