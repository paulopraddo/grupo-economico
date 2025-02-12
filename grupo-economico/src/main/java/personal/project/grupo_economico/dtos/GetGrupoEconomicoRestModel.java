package personal.project.grupo_economico.dtos;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GetGrupoEconomicoRestModel {

    private String nome;
    private LocalDate dataDeCriacao;
    private LocalDateTime dataDeUltimaAtualizacao;
}
