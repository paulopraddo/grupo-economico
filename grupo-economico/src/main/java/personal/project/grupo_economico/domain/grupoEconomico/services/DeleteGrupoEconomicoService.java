package personal.project.grupo_economico.services;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.entitys.GrupoEconomicoEntity;
import personal.project.grupo_economico.repository.GrupoEconomicoRepository;
import personal.project.grupo_economico.useCases.DeleteGrupoEconomicoUseCase;

@Service
@AllArgsConstructor
public class DeleteGrupoEconomicoService implements DeleteGrupoEconomicoUseCase{

    private final GrupoEconomicoRepository repository;

    @Override
    public void execute(String id) {
        GrupoEconomicoEntity entity = this.repository.findById(id).orElse(null);

        if(entity == null) {
            throw new RuntimeException();
        }

        this.repository.delete(entity);
    }


}
