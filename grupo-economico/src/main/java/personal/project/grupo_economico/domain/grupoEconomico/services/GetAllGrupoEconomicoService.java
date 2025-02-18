package personal.project.grupo_economico.domain.grupoEconomico.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.grupoEconomico.provider.GrupoEconomicoDataProvider;
import personal.project.grupo_economico.app.grupoEconomico.provider.entity.GrupoEconomicoEntity;
import personal.project.grupo_economico.app.grupoEconomico.restModels.GetGrupoEconomicoRestModel;
import personal.project.grupo_economico.domain.grupoEconomico.converters.GrupoEconomicoEntityToGetGrupoEconomicoRestModel;
import personal.project.grupo_economico.domain.grupoEconomico.useCases.GetAllGrupoEconomicoUseCase;

@Service
@AllArgsConstructor
public class GetAllGrupoEconomicoService implements GetAllGrupoEconomicoUseCase{

    private final GrupoEconomicoDataProvider dataProvider;
    private final GrupoEconomicoEntityToGetGrupoEconomicoRestModel converter;

    @Override
    public List<GetGrupoEconomicoRestModel> execute() {

        List<GrupoEconomicoEntity> entityList = this.dataProvider.getListOfGrupoEconomicoEntity();

        if(entityList.isEmpty()) {
            throw new RuntimeException("Nenhum grupo economico registrado.");
        }

        return this.converter.convertToDtoList(entityList);
    }
}
