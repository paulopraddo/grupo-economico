package personal.project.grupo_economico.app.colaborador.provider;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import personal.project.grupo_economico.app.grupoEconomico.repository.ColaboradroRepository;

@Component
@AllArgsConstructor
public class ColaboradorProvider {

    private final ColaboradroRepository repository;
}
