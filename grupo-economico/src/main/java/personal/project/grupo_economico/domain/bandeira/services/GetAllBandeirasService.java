package personal.project.grupo_economico.domain.bandeira.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.bandeira.provider.BandeiraDataProvider;
import personal.project.grupo_economico.app.bandeira.provider.entity.BandeiraEntity;
import personal.project.grupo_economico.app.bandeira.restModels.GetBandeiraRestModel;
import personal.project.grupo_economico.domain.bandeira.converters.BandeiraEntityToGetBandeiraRestModel;
import personal.project.grupo_economico.domain.bandeira.useCases.GetAllBandeirasUseCase;

@Service
@AllArgsConstructor
public class GetAllBandeirasService implements GetAllBandeirasUseCase {

    private final BandeiraDataProvider dataProvider;
    private final BandeiraEntityToGetBandeiraRestModel converter;

    @Override
    public List<GetBandeiraRestModel> execute() {

        List<BandeiraEntity> entityList = this.dataProvider.getAllBandeiraEntitys();

        return entityList.stream()
                .map(converter::convertToRestModel)
                .collect(Collectors.toList());
    }


}
