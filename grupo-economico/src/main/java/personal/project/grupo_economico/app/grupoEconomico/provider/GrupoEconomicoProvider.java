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
    public GrupoEconomicoEntity getGrupoEconomicoEntity(String nome) {
        return this.repository.findByNome(nome);
    }

    @Override
    public List<GrupoEconomicoEntity> getListOfGrupoEconomicoEntity() {
        return this.repository.findAll();
    }

    @Override
    public void updateGrupoEconomicoNome(UpdateGrupoEconomicoNomeDto dto) {
        GrupoEconomicoEntity entity = this.repository.findByNome(dto.getNome());

        entity.setNome(dto.getNewNome());
        
        this.repository.save(entity);
    }

    @Override
    public void deleteGrupoEconomico(String nome) {
        this.repository.deleteByNome(nome);
    }

}
