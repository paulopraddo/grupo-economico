package personal.project.grupo_economico.app.bandeira.entrypoints;

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
import personal.project.grupo_economico.app.bandeira.restModels.GetBandeiraRestModel;
import personal.project.grupo_economico.app.bandeira.restModels.UpdateBandeiraDto;
import personal.project.grupo_economico.app.bandeira.restModels.UploadBandeiraRestModel;
import personal.project.grupo_economico.domain.bandeira.useCases.DeleteBandeiraUseCase;
import personal.project.grupo_economico.domain.bandeira.useCases.GetAllBandeirasUseCase;
import personal.project.grupo_economico.domain.bandeira.useCases.GetBandeiraUseCase;
import personal.project.grupo_economico.domain.bandeira.useCases.UpdateBandeiraNomeUseCase;
import personal.project.grupo_economico.domain.bandeira.useCases.UploadBandeiraUseCase;

@RestController
@RequestMapping("/bandeira")
@AllArgsConstructor
public class BandeiraController {

    private final UploadBandeiraUseCase uploadBandeiraUseCase;
    private final GetBandeiraUseCase getBandeiraUseCase;
    private final GetAllBandeirasUseCase getAllBandeirasUseCase;
    private final UpdateBandeiraNomeUseCase updateBandeiraNomeUseCase;
    private final DeleteBandeiraUseCase deleteBandeiraUseCase;

    @PostMapping
    public void uploadBandeira(@RequestBody UploadBandeiraRestModel restModel) {

        this.uploadBandeiraUseCase.execute(restModel);

    }

    @GetMapping("/{nome}")
    public ResponseEntity<GetBandeiraRestModel> getBandeira(@PathVariable String nome) {

        GetBandeiraRestModel restModel = this.getBandeiraUseCase.execute(nome);

        return ResponseEntity.ok().body(restModel);
    }

    @GetMapping
    public ResponseEntity<List<GetBandeiraRestModel>> getAllBandeiras() {

        List<GetBandeiraRestModel> restModelsList = this.getAllBandeirasUseCase.execute();

        return ResponseEntity.ok().body(restModelsList);
    }

    @PutMapping
    public ResponseEntity<String> updateBandeiraNome(@RequestBody UpdateBandeiraDto restModel) {

        this.updateBandeiraNomeUseCase.execute(restModel);

        return ResponseEntity.ok().body("Nome da bandeira atualizado com sucesso");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBandeira(@PathVariable String id) {

        this.deleteBandeiraUseCase.execute(id);

        return ResponseEntity.ok().body("Bandeira deletada com sucesso");
    }
}
