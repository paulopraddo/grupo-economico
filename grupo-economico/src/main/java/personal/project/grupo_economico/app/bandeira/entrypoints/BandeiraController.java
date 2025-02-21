package personal.project.grupo_economico.app.bandeira.entrypoints;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.bandeira.restModels.GetBandeiraRestModel;
import personal.project.grupo_economico.app.bandeira.restModels.UpdateBandeiraNomeRestModel;
import personal.project.grupo_economico.app.bandeira.restModels.UploadBandeiraRestModel;
import personal.project.grupo_economico.domain.bandeira.useCases.GetBandeiraUseCase;
import personal.project.grupo_economico.domain.bandeira.useCases.UpdateBandeiraNomeUseCase;
import personal.project.grupo_economico.domain.bandeira.useCases.UploadBandeiraUseCase;

@RestController
@RequestMapping("/app/bandeira")
@AllArgsConstructor
public class BandeiraController {

    private final UploadBandeiraUseCase uploadBandeiraUseCase;
    private final GetBandeiraUseCase getBandeiraUseCase;
    private final UpdateBandeiraNomeUseCase updateBandeiraNomeUseCase;

    @PostMapping
    public void uploadBandeira(@RequestBody UploadBandeiraRestModel restModel) {

        this.uploadBandeiraUseCase.execute(restModel);

    }

    @GetMapping("/{id}")
    public GetBandeiraRestModel getBandeira(@PathVariable String id) {
        
        return this.getBandeiraUseCase.execute(id);
    }

    @PutMapping("/nome")
    public ResponseEntity<String> updateBandeiraNome(@RequestBody UpdateBandeiraNomeRestModel restModel) {

        this.updateBandeiraNomeUseCase.execute(restModel);

        return ResponseEntity.ok().body("Nome da bandeira atualizado com sucesso");
    }
}
