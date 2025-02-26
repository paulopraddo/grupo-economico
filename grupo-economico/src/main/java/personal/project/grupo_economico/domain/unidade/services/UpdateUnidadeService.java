package personal.project.grupo_economico.domain.unidade.services;

import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.unidade.provider.UnidadeDataProvider;
import personal.project.grupo_economico.app.unidade.provider.entity.UnidadeEntity;
import personal.project.grupo_economico.app.unidade.restModels.UpdateUnidadeRestModel;
import personal.project.grupo_economico.domain.unidade.useCases.UpdateUnidadeUseCase;

@Service
@AllArgsConstructor
public class UpdateUnidadeService implements UpdateUnidadeUseCase{
    
    private final UnidadeDataProvider dataProvider;

    @Override
    public void execute(UpdateUnidadeRestModel restModel) {
        UnidadeEntity entity = this.dataProvider.getUnidade(restModel.getId());

        if(entity == null) {
            throw new EntityNotFoundException("O registro selecionado não foi encontrado na base de dados");
        }

        this.dataProvider.updateUnidade(restModel);
    }

}
