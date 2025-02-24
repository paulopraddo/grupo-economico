package personal.project.grupo_economico.app.unidade.entrypoints;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.unidade.restModels.UploadUnidadeRestModel;
import personal.project.grupo_economico.domain.unidade.useCases.UploadUnidadeUseCase;

@RestController
@AllArgsConstructor
@RequestMapping("/unidade")
public class UnidadeController {

    private final UploadUnidadeUseCase uploadUnidadeUseCase;

    @PostMapping()
    public ResponseEntity<String> uploadUnidade(@RequestBody UploadUnidadeRestModel restModel) {
        
        this.uploadUnidadeUseCase.execute(restModel);

        return ResponseEntity.ok().body("Unidade adicionada com sucesso");
    }
}
