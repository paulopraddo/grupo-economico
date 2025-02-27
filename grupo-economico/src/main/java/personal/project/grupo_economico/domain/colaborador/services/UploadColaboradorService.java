package personal.project.grupo_economico.domain.colaborador.services;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.colaborador.provider.ColaboradorDataProvider;
import personal.project.grupo_economico.app.colaborador.provider.entity.ColaboradorEntity;
import personal.project.grupo_economico.app.colaborador.restModels.UploadColaboradorRestModel;
import personal.project.grupo_economico.domain.colaborador.converters.UploadColaboradorRestModelToColaboradorEntity;
import personal.project.grupo_economico.domain.colaborador.useCases.UploadColaboradorUseCase;

@Service
@AllArgsConstructor
public class UploadColaboradorService implements UploadColaboradorUseCase {

    private final ColaboradorDataProvider dataProvider;
    private final UploadColaboradorRestModelToColaboradorEntity converter;

    @Override
    public void execute(UploadColaboradorRestModel restModel) {
        ColaboradorEntity entity = this.converter.convertToEntity(restModel);

        try {
            this.dataProvider.uploadColaborador(entity);
        } catch (Exception e) {
            throw new RuntimeException("Não foi possivel salvar o registro de colaborador");
        }
    }
}
