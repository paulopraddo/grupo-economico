package personal.project.grupo_economico.domain.unidade.converters;

import org.springframework.stereotype.Component;

import personal.project.grupo_economico.app.unidade.provider.entity.UnidadeEntity;
import personal.project.grupo_economico.app.unidade.restModels.GetUnidadeRestModel;
import personal.project.grupo_economico.utils.ModelEntityMapper;

@Component
public class UnidadeEntityToGetUnidadeRestModel extends ModelEntityMapper<UnidadeEntity, GetUnidadeRestModel> {

    @Override
    public GetUnidadeRestModel convertToRestModel(UnidadeEntity entity) {
        return GetUnidadeRestModel.builder()
        .nomeFantasia(entity.getNomeFantasia())
        .razaoSocial(entity.getRazaoSocial())
        .cnpj(entity.getCnpj())
        .nomeBandeira(entity.getBandeira().getNome())
        .dataDeCriacao(entity.getDataDeCriacao())
        .dataDeUltimaAtualizacao(entity.getUltimaAtualizacao())
        .build();
    }

    @Override
    public UnidadeEntity convertToEntity(GetUnidadeRestModel model) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'convertToEntity'");
    }

}
