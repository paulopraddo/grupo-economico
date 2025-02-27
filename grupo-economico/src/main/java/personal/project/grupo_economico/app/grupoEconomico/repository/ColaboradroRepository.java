package personal.project.grupo_economico.app.grupoEconomico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import personal.project.grupo_economico.app.colaborador.provider.entity.ColaboradorEntity;

@Repository
public interface ColaboradroRepository extends JpaRepository<ColaboradorEntity, String> {

}
