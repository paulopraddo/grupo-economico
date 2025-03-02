package personal.project.grupo_economico.domain.bandeira.services;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.bandeira.provider.BandeiraDataProvider;
import personal.project.grupo_economico.app.bandeira.provider.entity.BandeiraEntity;
import personal.project.grupo_economico.app.bandeira.restModels.GetBandeiraRestModel;
import personal.project.grupo_economico.domain.bandeira.converters.BandeiraEntityToGetBandeiraRestModel;
import personal.project.grupo_economico.domain.bandeira.useCases.GetBandeiraUseCase;

@Service
@AllArgsConstructor
public class GetBandeiraService implements GetBandeiraUseCase {

    private final BandeiraDataProvider bandeiraDataProvider;
    private final BandeiraEntityToGetBandeiraRestModel converter;

    @Override
    public GetBandeiraRestModel execute(String nome) {

        BandeiraEntity entity = this.bandeiraDataProvider.getBandeiraEntity(nome);

        if(entity == null) {
            throw new RuntimeException("Não foi possivel encontrar a bandeira com o ID especificado");
        }

        return this.converter.convertToRestModel(entity);
    }
    

}
