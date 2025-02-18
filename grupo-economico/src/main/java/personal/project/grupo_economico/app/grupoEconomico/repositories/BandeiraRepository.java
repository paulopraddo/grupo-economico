package personal.project.grupo_economico.app.grupoEconomico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import personal.project.grupo_economico.app.bandeira.entity.BandeiraEntity;

@Repository
public interface BandeiraRepository extends JpaRepository<BandeiraEntity, String> {

}
