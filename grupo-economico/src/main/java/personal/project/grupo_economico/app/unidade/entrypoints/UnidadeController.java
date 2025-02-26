package personal.project.grupo_economico.app.unidade.entrypoints;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.unidade.restModels.GetUnidadeRestModel;
import personal.project.grupo_economico.app.unidade.restModels.UpdateUnidadeRestModel;
import personal.project.grupo_economico.app.unidade.restModels.UploadUnidadeRestModel;
import personal.project.grupo_economico.domain.unidade.useCases.GetListOfUnidadeUseCase;
import personal.project.grupo_economico.domain.unidade.useCases.GetUnidadeUseCase;
import personal.project.grupo_economico.domain.unidade.useCases.UpdateUnidadeUseCase;
import personal.project.grupo_economico.domain.unidade.useCases.UploadUnidadeUseCase;

@RestController
@AllArgsConstructor
@RequestMapping("/unidade")
public class UnidadeController {

    private final UploadUnidadeUseCase uploadUnidadeUseCase;
    private final GetUnidadeUseCase getUnidadeUseCase;
    private final GetListOfUnidadeUseCase getListOfUnidadeUseCase;
    private final UpdateUnidadeUseCase updateUnidadeUseCase;

    @PostMapping()
    public ResponseEntity<String> uploadUnidade(@RequestBody UploadUnidadeRestModel restModel) {
        
        this.uploadUnidadeUseCase.execute(restModel);

        return ResponseEntity.ok().body("Unidade adicionada com sucesso");
    }

    @GetMapping("/{id}")
    public ResponseEntity<GetUnidadeRestModel> getUnidade(@PathVariable String id) {
        return ResponseEntity.ok().body(this.getUnidadeUseCase.execute(id));
    }

    @GetMapping
    public ResponseEntity<List<GetUnidadeRestModel>> getListOfUnidade() {
        return ResponseEntity.ok().body(this.getListOfUnidadeUseCase.execute());
    }

    @PutMapping
    public ResponseEntity<String> updateUnidade(@RequestBody UpdateUnidadeRestModel restModel) {

        this.updateUnidadeUseCase.execute(restModel);

        return ResponseEntity.ok().body("Unidade alterada com sucesso.");
    }
}
