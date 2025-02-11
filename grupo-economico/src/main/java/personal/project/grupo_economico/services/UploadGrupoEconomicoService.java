package personal.project.grupo_economico.services;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.converters.UploadGrupoEconomicoRestModelToGrupoEconomicoEntity;
import personal.project.grupo_economico.entitys.GrupoEconomicoEntity;
import personal.project.grupo_economico.repository.GrupoEconomicoRepository;
import personal.project.grupo_economico.restModels.UploadGrupoEconomicoRestModel;
import personal.project.grupo_economico.useCases.UploadGrupoEconomicoUseCase;

@Service
@AllArgsConstructor
public class UploadGrupoEconomicoService implements UploadGrupoEconomicoUseCase{

    private final GrupoEconomicoRepository repository;
    private final UploadGrupoEconomicoRestModelToGrupoEconomicoEntity converter;

    @Override
    public void execute(UploadGrupoEconomicoRestModel restModel) {

        GrupoEconomicoEntity entity = this.converter.convertToEntity(restModel);

        this.repository.save(entity);
    }

}
