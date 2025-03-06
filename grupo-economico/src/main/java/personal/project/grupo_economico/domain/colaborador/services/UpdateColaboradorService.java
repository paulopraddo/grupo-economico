package personal.project.grupo_economico.domain.colaborador.services;

import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.colaborador.provider.ColaboradorDataProvider;
import personal.project.grupo_economico.app.colaborador.provider.entity.ColaboradorEntity;
import personal.project.grupo_economico.app.colaborador.restModels.UpdateColaboradorDto;
import personal.project.grupo_economico.domain.colaborador.useCases.UpdateColaboradorUseCase;

@Service
@AllArgsConstructor
public class UpdateColaboradorService implements UpdateColaboradorUseCase {

    private final ColaboradorDataProvider dataProvider;

    @Override
    public void execute(UpdateColaboradorDto dto) {

        ColaboradorEntity entity = this.dataProvider.getColaborador(dto.getNome());

        if(entity == null) {
            throw new EntityNotFoundException("Não foi possivel encontrar o registro de colaborador");
        }

        this.dataProvider.updateColaborador(dto);
    }

}
