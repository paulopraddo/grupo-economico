package personal.project.grupo_economico.app.colaborador.entrypoints;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.colaborador.restModels.GetColaboradorRestModel;
import personal.project.grupo_economico.app.colaborador.restModels.UploadColaboradorRestModel;
import personal.project.grupo_economico.domain.colaborador.useCases.GetColaboradorUseCase;
import personal.project.grupo_economico.domain.colaborador.useCases.UploadColaboradorUseCase;

@RestController
@AllArgsConstructor
@RequestMapping("/colaborador")
public class ColaboradorController {

    private final UploadColaboradorUseCase uploadColaboradorUseCase;
    private final GetColaboradorUseCase getColaboradorUseCase;

    @PostMapping
    public ResponseEntity<String> uploadColaborador(@RequestBody UploadColaboradorRestModel restModel) {

        this.uploadColaboradorUseCase.execute(restModel);

        return ResponseEntity.ok().body("Colaborador registrado com sucesso");
    }

    @GetMapping("/{id}")
    public ResponseEntity<GetColaboradorRestModel> getColaborador(@PathVariable String id) {
        return ResponseEntity.ok().body(this.getColaboradorUseCase.execute(id));
    }
}
