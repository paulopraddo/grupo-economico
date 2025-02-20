package personal.project.grupo_economico.app.bandeira.restModels;

import lombok.Data;

@Data
public class UpdateBandeiraRestModel {

    private String id;
    private String nome;
    private String grupoEconomicoId;
}
