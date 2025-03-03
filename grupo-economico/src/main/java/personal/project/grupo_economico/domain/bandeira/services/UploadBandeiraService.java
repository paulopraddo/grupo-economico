package personal.project.grupo_economico.domain.bandeira.services;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.bandeira.provider.BandeiraDataProvider;
import personal.project.grupo_economico.app.bandeira.provider.entity.BandeiraEntity;
import personal.project.grupo_economico.app.bandeira.restModels.UploadBandeiraRestModel;
import personal.project.grupo_economico.domain.bandeira.converters.UploadBandeiraRestModelToBandeiraEntity;
import personal.project.grupo_economico.domain.bandeira.useCases.UploadBandeiraUseCase;

@Service
@AllArgsConstructor
public class UploadBandeiraService implements UploadBandeiraUseCase{

    private final BandeiraDataProvider bandeiraDataProvider;
    private final UploadBandeiraRestModelToBandeiraEntity converter;

    @Override
    public void execute(UploadBandeiraRestModel restModel) {

        BandeiraEntity bandeiraEntity = this.converter.convertToEntity(restModel);

        this.bandeiraDataProvider.uploadBandeira(bandeiraEntity);
    }

}
