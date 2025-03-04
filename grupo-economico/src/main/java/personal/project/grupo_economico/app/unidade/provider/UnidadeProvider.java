package personal.project.grupo_economico.app.unidade.provider;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.bandeira.provider.entity.BandeiraEntity;
import personal.project.grupo_economico.app.unidade.provider.entity.UnidadeEntity;
import personal.project.grupo_economico.app.unidade.repository.UnidadeRepository;
import personal.project.grupo_economico.app.unidade.restModels.UpdateUnidadeRestModel;

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
    public void updateUnidade(UpdateUnidadeRestModel restModel) {
        UnidadeEntity entity = this.repository.findById(restModel.getId()).orElse(null);

        entity.setNomeFantasia(restModel.getNomeFantasia());
        entity.setRazaoSocial(restModel.getRazaoSocial());
        entity.setCnpj(restModel.getCnpj());
        entity.setBandeira(BandeiraEntity.builder().id(restModel.getBandeiraId()).build());

        this.repository.save(entity);
    }

    @Override
    public void deleteUnidade(String id) {
        this.repository.deleteById(id);
    }
    

}
