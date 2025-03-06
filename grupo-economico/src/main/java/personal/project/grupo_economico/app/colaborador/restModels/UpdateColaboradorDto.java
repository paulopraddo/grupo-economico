package personal.project.grupo_economico.app.colaborador.restModels;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class UpdateColaboradorDto {

    private String nome;
    private String newNome;
    private String email;
    private String cpf;
    private String unidadeId;
}
