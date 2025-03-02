package personal.project.grupo_economico.app.colaborador.provider;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.colaborador.provider.entity.ColaboradorEntity;
import personal.project.grupo_economico.app.colaborador.restModels.UpdateColaboradorRestModel;
import personal.project.grupo_economico.app.grupoEconomico.repository.ColaboradroRepository;
import personal.project.grupo_economico.app.unidade.provider.entity.UnidadeEntity;

@Component
@AllArgsConstructor
public class ColaboradorProvider implements ColaboradorDataProvider {

    private final ColaboradroRepository repository;

    @Override
    public void uploadColaborador(ColaboradorEntity entity) {
        this.repository.save(entity);
    }

    @Override
    public ColaboradorEntity getColaborador(String id) {
        return this.repository.findById(id).orElse(null);
    }

    @Override
    public List<ColaboradorEntity> getListOfColaborador() {
        return this.repository.findAll();
    }

    @Override
    public void updateColaborador(UpdateColaboradorRestModel restModel) {
        ColaboradorEntity entity = this.repository.findById(restModel.getId()).orElse(null);

        entity.setNome(restModel.getNome());
        entity.setEmail(restModel.getEmail());
        entity.setCpf(restModel.getCpf());
        entity.setUnidade(UnidadeEntity.builder().id(restModel.getUnidadadeId()).build());

        this.repository.save(entity);
    }

    @Override
    public void deleteColaborador(String id) {
        this.repository.deleteById(id);
    }

}
