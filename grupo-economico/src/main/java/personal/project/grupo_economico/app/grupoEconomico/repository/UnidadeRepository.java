package personal.project.grupo_economico.app.grupoEconomico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import personal.project.grupo_economico.app.unidade.entity.UnidadeEntity;

@Repository
public interface UnidadeRepository extends JpaRepository<UnidadeEntity, String>{

}
