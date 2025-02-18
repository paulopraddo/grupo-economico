package personal.project.grupo_economico.app.grupoEconomico.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import personal.project.grupo_economico.app.grupoEconomico.provider.entity.GrupoEconomicoEntity;

@Repository
public interface GrupoEconomicoRepository extends JpaRepository<GrupoEconomicoEntity, String> {

}
