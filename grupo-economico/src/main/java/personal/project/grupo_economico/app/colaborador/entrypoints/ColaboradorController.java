package personal.project.grupo_economico.app.colaborador.entrypoints;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.colaborador.restModels.UploadColaboradorRestModel;
import personal.project.grupo_economico.domain.colaborador.useCases.UploadColaboradorUseCase;

@RestController
@AllArgsConstructor
@RequestMapping("/colaborador")
public class ColaboradorController {

    private final UploadColaboradorUseCase uploadColaboradorUseCase;

    @GetMapping
    public ResponseEntity<String> testeController() {
        return ResponseEntity.ok().body("Teste da controller");
    }

    @PostMapping
    public ResponseEntity<String> uploadColaborador(@RequestBody UploadColaboradorRestModel restModel) {

        this.uploadColaboradorUseCase.execute(restModel);

        return ResponseEntity.ok().body("Colaborador registrado com sucesso");
    }
}
