package personal.project.grupo_economico.app.colaborador.entrypoints;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.colaborador.restModels.GetColaboradorRestModel;
import personal.project.grupo_economico.app.colaborador.restModels.UpdateColaboradorDto;
import personal.project.grupo_economico.app.colaborador.restModels.UploadColaboradorRestModel;
import personal.project.grupo_economico.domain.colaborador.useCases.DeleteColaboradorUseCase;
import personal.project.grupo_economico.domain.colaborador.useCases.GetColaboradorUseCase;
import personal.project.grupo_economico.domain.colaborador.useCases.GetListOfColaboradorUseCase;
import personal.project.grupo_economico.domain.colaborador.useCases.UpdateColaboradorUseCase;
import personal.project.grupo_economico.domain.colaborador.useCases.UploadColaboradorUseCase;

@RestController
@AllArgsConstructor
@RequestMapping("/colaborador")
public class ColaboradorController {

    private final UploadColaboradorUseCase uploadColaboradorUseCase;
    private final GetColaboradorUseCase getColaboradorUseCase;
    private final GetListOfColaboradorUseCase getListOfColaboradorUseCase;
    private final UpdateColaboradorUseCase updateColaboradorUseCase;
    private final DeleteColaboradorUseCase deleteColaboradorUseCase;

    @PostMapping
    public ResponseEntity<String> uploadColaborador(@RequestBody UploadColaboradorRestModel restModel) {

        this.uploadColaboradorUseCase.execute(restModel);

        return ResponseEntity.ok().body("Colaborador registrado com sucesso");
    }

    @GetMapping("/{nome}")
    public ResponseEntity<GetColaboradorRestModel> getColaborador(@PathVariable String nome) {
        return ResponseEntity.ok().body(this.getColaboradorUseCase.execute(nome));
    }

    @GetMapping
    public ResponseEntity<List<GetColaboradorRestModel>> getListOfColaborador() {
        return ResponseEntity.ok().body(this.getListOfColaboradorUseCase.execute());
    }

    @PutMapping
    public ResponseEntity<String> updateColaborador(@RequestBody UpdateColaboradorDto dto) {

        this.updateColaboradorUseCase.execute(dto);

        return ResponseEntity.ok().body("Colaborador atualizado com sucesso");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteColaborador(@PathVariable String id) {

        this.deleteColaboradorUseCase.execute(id);

        return ResponseEntity.ok().body("Colaborador deletado com sucesso");
    }
}
