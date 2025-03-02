package personal.project.grupo_economico.domain.grupoEconomico.services;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.grupoEconomico.provider.GrupoEconomicoDataProvider;
import personal.project.grupo_economico.app.grupoEconomico.provider.entity.GrupoEconomicoEntity;
import personal.project.grupo_economico.app.grupoEconomico.restModels.GetGrupoEconomicoRestModel;
import personal.project.grupo_economico.domain.grupoEconomico.converters.GrupoEconomicoEntityToGetGrupoEconomicoRestModel;
import personal.project.grupo_economico.domain.grupoEconomico.useCases.GetGrupoEconomicoUseCase;

@Service
@AllArgsConstructor
public class GetGrupoEconomicoService implements GetGrupoEconomicoUseCase {

    private final GrupoEconomicoDataProvider dataProvider;
    private final GrupoEconomicoEntityToGetGrupoEconomicoRestModel converter;

    @Override
    public GetGrupoEconomicoRestModel execute(String nome) {
        
        GrupoEconomicoEntity entity = this.dataProvider.getGrupoEconomicoEntity(nome);

        if(entity == null) {
            throw new RuntimeException("Grupo economico não pode ser encontrado, insira um ID correto");
        }
        
        return this.converter.convertToRestModel(entity);
    }

    
}
