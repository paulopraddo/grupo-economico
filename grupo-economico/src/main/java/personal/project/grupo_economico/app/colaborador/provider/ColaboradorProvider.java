package personal.project.grupo_economico.app.colaborador.provider;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.colaborador.provider.entity.ColaboradorEntity;
import personal.project.grupo_economico.app.colaborador.repository.ColaboradorRepository;
import personal.project.grupo_economico.app.colaborador.restModels.UpdateColaboradorDto;
import personal.project.grupo_economico.app.unidade.provider.entity.UnidadeEntity;

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
    public void updateColaborador(UpdateColaboradorDto dto) {
        ColaboradorEntity entity = this.getColaborador(dto.getNome());

        entity.setNome(dto.getNewNome());
        entity.setEmail(dto.getEmail());
        entity.setCpf(dto.getCpf());
        entity.setUnidade(UnidadeEntity.builder().id(dto.getUnidadeId()).build());

        this.repository.save(entity);
    }

    @Override
    public void deleteColaborador(String nome) {
        this.repository.deleteByNome(nome);
    }

}
