package personal.project.grupo_economico.domain.unidade.services;

import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.unidade.provider.UnidadeDataProvider;
import personal.project.grupo_economico.app.unidade.provider.entity.UnidadeEntity;
import personal.project.grupo_economico.app.unidade.restModels.UpdateUnidadeDto;
import personal.project.grupo_economico.domain.unidade.useCases.UpdateUnidadeUseCase;

@Service
@AllArgsConstructor
public class UpdateUnidadeService implements UpdateUnidadeUseCase{
    
    private final UnidadeDataProvider dataProvider;

    @Override
    public void execute(UpdateUnidadeDto dto) {
        UnidadeEntity entity = this.dataProvider.getUnidade(dto.getNomeFantasia());

        if(entity == null) {
            throw new EntityNotFoundException("O registro selecionado não foi encontrado na base de dados");
        }

        if(dto.getBandeiraId() == null) {
            dto.setBandeiraId(entity.getBandeira().getId());
        }
        
        this.dataProvider.updateUnidade(dto);
    }

}
