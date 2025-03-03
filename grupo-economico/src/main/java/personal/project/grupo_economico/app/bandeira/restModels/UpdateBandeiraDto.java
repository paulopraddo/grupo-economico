package personal.project.grupo_economico.app.bandeira.restModels;

import lombok.Data;

@Data
public class UpdateBandeiraDto {

    private String nome;
    private String newNome;
    private String grupoEconomicoId;
}
