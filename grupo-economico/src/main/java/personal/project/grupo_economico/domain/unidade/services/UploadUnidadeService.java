package personal.project.grupo_economico.domain.unidade.services;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.unidade.provider.UnidadeDataProvider;
import personal.project.grupo_economico.app.unidade.provider.entity.UnidadeEntity;
import personal.project.grupo_economico.app.unidade.restModels.UploadUnidadeRestModel;
import personal.project.grupo_economico.domain.unidade.converters.UploadUnidadeRestModelToUnidadeEntity;
import personal.project.grupo_economico.domain.unidade.useCases.UploadUnidadeUseCase;

@Service
@AllArgsConstructor
public class UploadUnidadeService implements UploadUnidadeUseCase{

    private final UnidadeDataProvider dataProvider;
    private final UploadUnidadeRestModelToUnidadeEntity converter;

    @Override
    public void execute(UploadUnidadeRestModel restModel) {

        UnidadeEntity entity = this.converter.convertToEntity(restModel);

        this.dataProvider.uploadUnidade(entity);
    }

}
