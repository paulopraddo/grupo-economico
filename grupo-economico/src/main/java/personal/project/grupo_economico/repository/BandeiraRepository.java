package personal.project.grupo_economico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import personal.project.grupo_economico.entitys.BandeiraEntity;

@Repository
public interface BandeiraRepository extends JpaRepository<BandeiraEntity, String> {

}
