package personal.project.grupo_economico.app.unidade.restModels;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GetUnidadeRestModel {

    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private String nomeBandeira;
    private LocalDate dataDeCriacao;
    private LocalDateTime dataDeUltimaAtualizacao;
}
