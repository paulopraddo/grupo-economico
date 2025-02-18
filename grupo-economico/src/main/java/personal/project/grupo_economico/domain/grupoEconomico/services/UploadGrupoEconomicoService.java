package personal.project.grupo_economico.domain.grupoEconomico.services;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.grupoEconomico.provider.GrupoEconomicoDataProvider;
import personal.project.grupo_economico.app.grupoEconomico.provider.entity.GrupoEconomicoEntity;
import personal.project.grupo_economico.app.grupoEconomico.restModels.UploadGrupoEconomicoRestModel;
import personal.project.grupo_economico.domain.grupoEconomico.converters.UploadGrupoEconomicoRestModelToGrupoEconomicoEntity;
import personal.project.grupo_economico.domain.grupoEconomico.useCases.UploadGrupoEconomicoUseCase;

@Service
@AllArgsConstructor
public class UploadGrupoEconomicoService implements UploadGrupoEconomicoUseCase{

    private final GrupoEconomicoDataProvider dataProvider;
    private final UploadGrupoEconomicoRestModelToGrupoEconomicoEntity converter;

    @Override
    public void execute(UploadGrupoEconomicoRestModel restModel) {

        GrupoEconomicoEntity entity = this.converter.convertToEntity(restModel);

        this.dataProvider.uploadGrupoEconomico(entity);
    }

}
