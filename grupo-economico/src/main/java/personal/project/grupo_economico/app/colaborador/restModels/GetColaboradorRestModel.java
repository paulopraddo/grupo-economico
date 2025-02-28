package personal.project.grupo_economico.app.colaborador.restModels;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GetColaboradorRestModel {
    private String nome;
    private String email;
    private String cpf;
    private String nomeUnidade;
    private LocalDate dataDeCriacao;
    private LocalDateTime dataDeAtualizacao;

}
