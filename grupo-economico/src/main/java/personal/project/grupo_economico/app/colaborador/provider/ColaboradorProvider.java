package personal.project.grupo_economico.app.colaborador.provider;

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

}
