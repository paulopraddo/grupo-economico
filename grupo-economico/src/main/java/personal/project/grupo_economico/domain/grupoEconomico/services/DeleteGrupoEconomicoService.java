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
    public void execute(String id) {
        GrupoEconomicoEntity entity = this.dataProvider.getGrupoEconomicoEntityFindByName(id);

        if(entity == null) {
            throw new RuntimeException("Grupo economico não pode ser encontrado, insira um ID correto");
        }

        this.dataProvider.deleteGrupoEconomicoEntityById(id);
    }


}
