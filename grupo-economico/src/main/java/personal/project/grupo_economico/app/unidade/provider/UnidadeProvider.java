package personal.project.grupo_economico.app.unidade.provider;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.unidade.provider.entity.UnidadeEntity;
import personal.project.grupo_economico.app.unidade.repository.UnidadeRepository;

@Component
@AllArgsConstructor
public class UnidadeProvider implements UnidadeDataProvider{

    private final UnidadeRepository repository;

    @Override
    public void uploadUnidade(UnidadeEntity entity) {
        this.repository.save(entity);
    }

}
