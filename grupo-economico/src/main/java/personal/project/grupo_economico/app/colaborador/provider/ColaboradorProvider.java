package personal.project.grupo_economico.app.colaborador.provider;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.colaborador.provider.entity.ColaboradorEntity;
import personal.project.grupo_economico.app.colaborador.repository.ColaboradorRepository;
import personal.project.grupo_economico.app.colaborador.restModels.UpdateColaboradorDto;

@Component
@AllArgsConstructor
public class ColaboradorProvider implements ColaboradorDataProvider {

    private final ColaboradorRepository repository;

    @Override
    public void uploadColaborador(ColaboradorEntity entity) {
        this.repository.save(entity);
    }

    @Override
    public ColaboradorEntity getColaborador(String nome) {
        return this.repository.findByNome(nome);
    }

    @Override
    public List<ColaboradorEntity> getListOfColaborador() {
        return this.repository.findAll();
    }

    @Override
    public void updateColaborador(UpdateColaboradorDto restModel) {
        ColaboradorEntity entity = this.repository.findByNome(restModel.getNome());

        //refatorar método para que seja possivel atualizar o registro da unidade do colaborador
        entity.setNome(restModel.getNewNome());
        entity.setEmail(restModel.getEmail());
        entity.setCpf(restModel.getCpf());

        this.repository.save(entity);
    }

    @Override
    public void deleteColaborador(String id) {
        this.repository.deleteById(id);
    }

}
