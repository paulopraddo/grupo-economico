package personal.project.grupo_economico.app.bandeira.entrypoints;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import personal.project.grupo_economico.app.bandeira.restModels.UploadBandeiraRestModel;

@RestController
@RequestMapping("/bandeira")
public class BandeiraController {

    @PostMapping
    public void uploadBandeira(@RequestBody UploadBandeiraRestModel restModel) {

    }
}
