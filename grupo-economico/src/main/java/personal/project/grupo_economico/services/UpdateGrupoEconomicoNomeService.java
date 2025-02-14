package personal.project.grupo_economico.services;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.dtos.UpdateGrupoEconomicoNomeDto;
import personal.project.grupo_economico.entitys.GrupoEconomicoEntity;
import personal.project.grupo_economico.repository.GrupoEconomicoRepository;
import personal.project.grupo_economico.useCases.UpdateGrupoEconomicoNomeUseCase;

@Service
@AllArgsConstructor
public class UpdateGrupoEconomicoNomeService implements UpdateGrupoEconomicoNomeUseCase{

    private final GrupoEconomicoRepository repository;

    @Override
    public void execute(UpdateGrupoEconomicoNomeDto dto) {
        
        GrupoEconomicoEntity entity = this.repository.findById(dto.getId()).orElse(null);

        if(entity == null) {
            throw new RuntimeException();
        }

        entity.setNome(dto.getNome());

        this.repository.save(entity);
    }
    
}
