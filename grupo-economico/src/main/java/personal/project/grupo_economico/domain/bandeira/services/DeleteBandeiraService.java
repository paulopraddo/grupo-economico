package personal.project.grupo_economico.domain.bandeira.services;

import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.bandeira.provider.BandeiraDataProvider;
import personal.project.grupo_economico.app.bandeira.provider.entity.BandeiraEntity;
import personal.project.grupo_economico.domain.bandeira.useCases.DeleteBandeiraUseCase;

@Service
@AllArgsConstructor
public class DeleteBandeiraService implements DeleteBandeiraUseCase{

    private final BandeiraDataProvider dataProvider;

    @Override
    public void execute(String id) {

        BandeiraEntity entity = this.dataProvider.getBandeiraEntity(id);

        if(entity == null) {
            throw new EntityNotFoundException("Registro não encontrado");
        }

        this.dataProvider.deleteBandeira(id);
    }
}
