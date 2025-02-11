package personal.project.grupo_economico.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.converters.GrupoEconomicoEntityToGetGrupoEconomicoRestModel;
import personal.project.grupo_economico.entitys.GrupoEconomicoEntity;
import personal.project.grupo_economico.repository.GrupoEconomicoRepository;
import personal.project.grupo_economico.restModels.GetGrupoEconomicoRestModel;
import personal.project.grupo_economico.useCases.GetAllGrupoEconomicoUseCase;

@Service
@AllArgsConstructor
public class GetAllGrupoEconomicoService implements GetAllGrupoEconomicoUseCase{

    private final GrupoEconomicoRepository repository;
    private final GrupoEconomicoEntityToGetGrupoEconomicoRestModel converter;

    @Override
    public List<GetGrupoEconomicoRestModel> execute() {

        List<GrupoEconomicoEntity> entityList = this.repository.findAll();

        return this.converter.convertToDtoList(entityList);
    }
}
