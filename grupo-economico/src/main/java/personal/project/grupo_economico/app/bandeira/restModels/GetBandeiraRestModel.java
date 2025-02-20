package personal.project.grupo_economico.app.bandeira.restModels;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GetBandeiraRestModel {

    private String nome;
    private String nomeGrupoEconomico;
    private LocalDate dataDeCriacao;
    private LocalDateTime dataDeUltimaAtualizacao;
}
