package personal.project.grupo_economico.app.grupoEconomico.entrypoints;


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
import personal.project.grupo_economico.app.grupoEconomico.restModels.GetGrupoEconomicoRestModel;
import personal.project.grupo_economico.app.grupoEconomico.restModels.UpdateGrupoEconomicoNomeDto;
import personal.project.grupo_economico.app.grupoEconomico.restModels.UploadGrupoEconomicoRestModel;
import personal.project.grupo_economico.domain.grupoEconomico.useCases.DeleteGrupoEconomicoUseCase;
import personal.project.grupo_economico.domain.grupoEconomico.useCases.GetAllGrupoEconomicoUseCase;
import personal.project.grupo_economico.domain.grupoEconomico.useCases.GetGrupoEconomicoUseCase;
import personal.project.grupo_economico.domain.grupoEconomico.useCases.UpdateGrupoEconomicoNomeUseCase;
import personal.project.grupo_economico.domain.grupoEconomico.useCases.UploadGrupoEconomicoUseCase;

@RestController
@RequestMapping("/grupo-economico")
@AllArgsConstructor
public class GrupoEconomicoController {

    private final UploadGrupoEconomicoUseCase uploadGrupoEconomicoUseCase;
    private final GetGrupoEconomicoUseCase getGrupoEconomicoUseCase;
    private final GetAllGrupoEconomicoUseCase getAllGrupoEconomicoUseCase;
    private final UpdateGrupoEconomicoNomeUseCase updateGrupoEconomicoService;
    private final DeleteGrupoEconomicoUseCase deleteGrupoEconomicoUseCase;

    @PostMapping
    public ResponseEntity<String> uploadGrupoEconomico(@RequestBody UploadGrupoEconomicoRestModel restModel) {
    
        this.uploadGrupoEconomicoUseCase.execute(restModel);

        return ResponseEntity.ok().body("Grupo economico adicionado com sucesso.");

    }

    @GetMapping("/{nome}")
    public ResponseEntity<GetGrupoEconomicoRestModel> getGrupoEconomicoById(@PathVariable String nome) {

        GetGrupoEconomicoRestModel restModel = this.getGrupoEconomicoUseCase.execute(nome);

        return ResponseEntity.ok().body(restModel);
    }
    
    @GetMapping
    public ResponseEntity<List<GetGrupoEconomicoRestModel>> getGrupoEconomico() {
        
        List<GetGrupoEconomicoRestModel> listOfGetGrupoEconomicoRestModels = this.getAllGrupoEconomicoUseCase.execute();

        return ResponseEntity.ok().body(listOfGetGrupoEconomicoRestModels);
    }

    @PutMapping
    public ResponseEntity<String> updateGrupoEconomico(@RequestBody UpdateGrupoEconomicoNomeDto dto) {                                                                                            

        this.updateGrupoEconomicoService.execute(dto);

        return ResponseEntity.ok().body("Grupo economico atualizado com sucesso");
    }

    @DeleteMapping("/{nome}")
    public ResponseEntity<String> deleteGrupoEconomico(@PathVariable String nome) {
        
        this.deleteGrupoEconomicoUseCase.execute(nome);

        return ResponseEntity.ok().body("Grupo economico deletado com sucesso");
    }

}


