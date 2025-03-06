package personal.project.grupo_economico.domain.colaborador.services;

import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.colaborador.provider.ColaboradorDataProvider;
import personal.project.grupo_economico.app.colaborador.provider.entity.ColaboradorEntity;
import personal.project.grupo_economico.domain.colaborador.useCases.DeleteColaboradorUseCase;

@Service
@AllArgsConstructor
public class DeleteColaboradorService implements DeleteColaboradorUseCase {

    private final ColaboradorDataProvider dataProvider;

    @Override
    public void execute(String nome) {
        ColaboradorEntity entity = this.dataProvider.getColaborador(nome);

        if(entity == null) {
            throw new EntityNotFoundException("Não foi possivel encontrar o registro de colaborador");
        }

        this.dataProvider.deleteColaborador(nome);
    }



}
