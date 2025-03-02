package personal.project.grupo_economico.domain.grupoEconomico.services;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.grupoEconomico.provider.GrupoEconomicoDataProvider;
import personal.project.grupo_economico.app.grupoEconomico.provider.entity.GrupoEconomicoEntity;
import personal.project.grupo_economico.app.grupoEconomico.restModels.UpdateGrupoEconomicoNomeDto;
import personal.project.grupo_economico.domain.grupoEconomico.useCases.UpdateGrupoEconomicoNomeUseCase;

@Service
@AllArgsConstructor
public class UpdateGrupoEconomicoNomeService implements UpdateGrupoEconomicoNomeUseCase{

    private final GrupoEconomicoDataProvider dataProvider;

    @Override
    public void execute(UpdateGrupoEconomicoNomeDto dto) {
        
        GrupoEconomicoEntity entity = this.dataProvider.getGrupoEconomicoEntity(dto.getNome());

        if(entity == null) {
            throw new RuntimeException("Grupo economico não pode ser encontrado, insira um ID correto");
        }

        this.dataProvider.updateGrupoEconomicoNome(dto);
    }
    
}
