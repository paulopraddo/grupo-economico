package personal.project.grupo_economico.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.dtos.GetGrupoEconomicoRestModel;
import personal.project.grupo_economico.dtos.UpdateGrupoEconomicoNomeDto;
import personal.project.grupo_economico.dtos.UploadGrupoEconomicoRestModel;
import personal.project.grupo_economico.useCases.GetAllGrupoEconomicoUseCase;
import personal.project.grupo_economico.useCases.GetGrupoEconomicoUseCase;
import personal.project.grupo_economico.useCases.UpdateGrupoEconomicoNomeUseCase;
import personal.project.grupo_economico.useCases.UploadGrupoEconomicoUseCase;

@RestController
@RequestMapping("/app")
@AllArgsConstructor
public class AppController {

    private final UploadGrupoEconomicoUseCase uploadGrupoEconomicoUseCase;
    private final GetGrupoEconomicoUseCase getGrupoEconomicoUseCase;
    private final GetAllGrupoEconomicoUseCase getAllGrupoEconomicoUseCase;
    private final UpdateGrupoEconomicoNomeUseCase updateGrupoEconomicoService;

    @PostMapping("/grupo-economico")
    public void uploadGrupoEconomico(@RequestBody UploadGrupoEconomicoRestModel restModel) {
    
        this.uploadGrupoEconomicoUseCase.execute(restModel);

    }

    @GetMapping("/grupo-economico/{id}")
    public ResponseEntity<GetGrupoEconomicoRestModel> getGrupoEconomicoById(@PathVariable String id) {

        return ResponseEntity.ok().body(this.getGrupoEconomicoUseCase.execute(id));
        
    }
    
    @GetMapping("/grupo-economico")
    public ResponseEntity<List<GetGrupoEconomicoRestModel>> getGrupoEconomico() {
        
        return ResponseEntity.ok().body(this.getAllGrupoEconomicoUseCase.execute());
        
    }

    @PutMapping("/grupo-economico")
    public ResponseEntity<HttpStatus> updateGrupoEconomicoNome(@RequestBody UpdateGrupoEconomicoNomeDto dto) {                                                                                            

        this.updateGrupoEconomicoService.execute(dto);

        return ResponseEntity.ok().build();
    }

}


