package personal.project.grupo_economico.app.bandeira.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import personal.project.grupo_economico.app.bandeira.provider.entity.BandeiraEntity;

@Repository
public interface BandeiraRepository extends JpaRepository<BandeiraEntity, String> {

}
