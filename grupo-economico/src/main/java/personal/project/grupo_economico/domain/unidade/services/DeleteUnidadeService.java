package personal.project.grupo_economico.domain.unidade.services;

import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.unidade.provider.UnidadeDataProvider;
import personal.project.grupo_economico.app.unidade.provider.entity.UnidadeEntity;
import personal.project.grupo_economico.domain.unidade.useCases.DeleteUnidadeUseCase;

@Service
@AllArgsConstructor
public class DeleteUnidadeService implements DeleteUnidadeUseCase {

    private final UnidadeDataProvider dataProvider;

    @Override
    public void execute(String id) {
        UnidadeEntity entity = this.dataProvider.getUnidade(id);

        if(entity == null) {
            throw new EntityNotFoundException("O registro selecionado não foi encontrado na base de dados");
        }

        this.dataProvider.deleteUnidade(id);
    }
    
}
