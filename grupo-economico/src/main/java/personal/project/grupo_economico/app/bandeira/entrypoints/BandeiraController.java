package personal.project.grupo_economico.app.bandeira.entrypoints;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.bandeira.restModels.UploadBandeiraRestModel;
import personal.project.grupo_economico.domain.bandeira.useCases.UploadBandeiraUseCase;

@RestController
@RequestMapping("/app/bandeira")
@AllArgsConstructor
public class BandeiraController {

    private final UploadBandeiraUseCase uploadBandeiraUseCase;

    @PostMapping
    public void uploadBandeira(@RequestBody UploadBandeiraRestModel restModel) {

        this.uploadBandeiraUseCase.execute(restModel);

    }
}
