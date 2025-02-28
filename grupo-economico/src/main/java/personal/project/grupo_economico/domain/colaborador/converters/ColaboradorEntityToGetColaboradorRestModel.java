package personal.project.grupo_economico.domain.colaborador.converters;

import org.springframework.stereotype.Component;

import personal.project.grupo_economico.app.colaborador.provider.entity.ColaboradorEntity;
import personal.project.grupo_economico.app.colaborador.restModels.GetColaboradorRestModel;
import personal.project.grupo_economico.utils.ModelEntityMapper;

@Component
public class ColaboradorEntityToGetColaboradorRestModel extends ModelEntityMapper<ColaboradorEntity, GetColaboradorRestModel> {

    @Override
    public GetColaboradorRestModel convertToRestModel(ColaboradorEntity entity) {
        return GetColaboradorRestModel.builder()
        .nome(entity.getNome())
        .email(entity.getEmail())
        .cpf(entity.getCpf())
        .nomeUnidade(entity.getUnidade().getNomeFantasia())
        .dataDeCriacao(entity.getDataDeCriacao())
        .dataDeAtualizacao(entity.getUltimaAtualizacao())
        .build();
    }

    @Override
    public ColaboradorEntity convertToEntity(GetColaboradorRestModel model) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'convertToEntity'");
    }

}
