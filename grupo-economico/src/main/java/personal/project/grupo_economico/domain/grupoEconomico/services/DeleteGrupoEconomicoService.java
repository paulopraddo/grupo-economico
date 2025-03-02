package personal.project.grupo_economico.domain.grupoEconomico.services;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.grupoEconomico.provider.GrupoEconomicoDataProvider;
import personal.project.grupo_economico.app.grupoEconomico.provider.entity.GrupoEconomicoEntity;
import personal.project.grupo_economico.domain.grupoEconomico.useCases.DeleteGrupoEconomicoUseCase;

@Service
@AllArgsConstructor
public class DeleteGrupoEconomicoService implements DeleteGrupoEconomicoUseCase{

    private final GrupoEconomicoDataProvider dataProvider;

    @Override
    public void execute(String nome) {
        GrupoEconomicoEntity entity = this.dataProvider.getGrupoEconomicoEntity(nome);

        if(entity == null) {
            throw new RuntimeException("Grupo economico não pode ser encontrado.");
        }

        this.dataProvider.deleteGrupoEconomico(nome);
    }


}
