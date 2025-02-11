package personal.project.grupo_economico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import personal.project.grupo_economico.entitys.ColaboradorEntity;

@Repository
public interface ColaboradroRepository extends JpaRepository<ColaboradorEntity, String> {

}
