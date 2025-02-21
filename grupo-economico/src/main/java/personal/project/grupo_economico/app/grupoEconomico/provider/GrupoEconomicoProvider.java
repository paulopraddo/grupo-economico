package personal.project.grupo_economico.app.grupoEconomico.provider;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.grupoEconomico.provider.entity.GrupoEconomicoEntity;
import personal.project.grupo_economico.app.grupoEconomico.repository.GrupoEconomicoRepository;
import personal.project.grupo_economico.app.grupoEconomico.restModels.UpdateGrupoEconomicoNomeDto;

@Component
@AllArgsConstructor
public class GrupoEconomicoProvider implements GrupoEconomicoDataProvider{

    private final GrupoEconomicoRepository repository;
    
    @Override
    public void uploadGrupoEconomico(GrupoEconomicoEntity entity) {
        this.repository.save(entity);
    }

    @Override
    public GrupoEconomicoEntity getGrupoEconomicoEntityById(String id) {
        return this.repository.findById(id).orElse(null);
    }

    @Override
    public List<GrupoEconomicoEntity> getListOfGrupoEconomicoEntity() {
        return this.repository.findAll();
    }

    @Override
    public void updateGrupoEconomicoNome(UpdateGrupoEconomicoNomeDto dto) {
        GrupoEconomicoEntity entity = this.repository.findById(dto.getId()).orElse(null);

        entity.setNome(dto.getNome());
        
        this.repository.save(entity);
    }

    @Override
    public void deleteGrupoEconomicoEntityById(String id) {
        this.repository.deleteById(id);
    }

}
