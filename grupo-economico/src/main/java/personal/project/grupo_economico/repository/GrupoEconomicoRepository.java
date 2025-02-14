package personal.project.grupo_economico.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import personal.project.grupo_economico.entitys.GrupoEconomicoEntity;

@Repository
public interface GrupoEconomicoRepository extends JpaRepository<GrupoEconomicoEntity, String> {

}
