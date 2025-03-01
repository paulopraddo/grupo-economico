package personal.project.grupo_economico.app.colaborador.restModels;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class UpdateColaboradorRestModel {

    private String id;
    private String nome;
    private String email;
    private String cpf;
    private String unidadadeId;

}
