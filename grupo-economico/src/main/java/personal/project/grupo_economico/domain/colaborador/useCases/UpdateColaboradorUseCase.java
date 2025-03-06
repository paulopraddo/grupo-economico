package personal.project.grupo_economico.domain.colaborador.useCases;

import personal.project.grupo_economico.app.colaborador.restModels.UpdateColaboradorDto;

public interface UpdateColaboradorUseCase {
    void execute(UpdateColaboradorDto dto);
}
