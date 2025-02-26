package personal.project.grupo_economico.app.colaborador.entrypoints;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/colaborador")
public class ColaboradorController {

    @GetMapping
    public ResponseEntity<String> testeController() {
        return ResponseEntity.ok().body("Teste da controller");
    }
}
