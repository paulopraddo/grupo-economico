package personal.project.grupo_economico.services;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.converters.GrupoEconomicoEntityToGetGrupoEconomicoRestModel;
import personal.project.grupo_economico.entitys.GrupoEconomicoEntity;
import personal.project.grupo_economico.repository.GrupoEconomicoRepository;
import personal.project.grupo_economico.restModels.GetGrupoEconomicoRestModel;
import personal.project.grupo_economico.useCases.GetGrupoEconomicoUseCase;

@Service
@AllArgsConstructor
public class GetGrupoEconomicoService implements GetGrupoEconomicoUseCase {

    private final GrupoEconomicoRepository repository;
    private final GrupoEconomicoEntityToGetGrupoEconomicoRestModel converter;

    @Override
    public GetGrupoEconomicoRestModel execute(String id) {
        
        GrupoEconomicoEntity entity = this.repository.findById(id).orElse(null);
        return this.converter.convertToRestModel(entity);
    }

    
}
