package personal.project.grupo_economico.app.unidade.restModels;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UpdateUnidadeRestModel {

    private String id;
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private String bandeiraId;
}
