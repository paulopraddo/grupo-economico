package personal.project.grupo_economico.app.unidade.provider;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.bandeira.provider.entity.BandeiraEntity;
import personal.project.grupo_economico.app.unidade.provider.entity.UnidadeEntity;
import personal.project.grupo_economico.app.unidade.repository.UnidadeRepository;
import personal.project.grupo_economico.app.unidade.restModels.UpdateUnidadeDto;

@Component
@AllArgsConstructor
public class UnidadeProvider implements UnidadeDataProvider{

    private final UnidadeRepository repository;

    @Override
    public void uploadUnidade(UnidadeEntity entity) {
        this.repository.save(entity);
    }

    @Override
    public UnidadeEntity getUnidade(String nome) {
        return this.repository.findByNomeFantasia(nome);
    }

    @Override
    public List<UnidadeEntity> getListOfUnidade() {
        return this.repository.findAll();
    }

    @Override
    public void updateUnidade(UpdateUnidadeDto dto) {
        UnidadeEntity entity = this.repository.findByNomeFantasia(dto.getNomeFantasia());

        entity.setNomeFantasia(dto.getNewNomeFantasia());
        entity.setRazaoSocial(dto.getRazaoSocial());
        entity.setCnpj(dto.getCnpj());
        entity.setBandeira(BandeiraEntity.builder().id(dto.getBandeiraId()).build());

        this.repository.save(entity);
    }

    @Override
    public void deleteUnidade(String nome) {
        this.repository.deleteByNomeFantasia(nome);
    }
    

}
