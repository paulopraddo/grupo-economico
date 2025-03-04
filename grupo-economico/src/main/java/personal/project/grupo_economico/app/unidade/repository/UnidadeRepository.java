package personal.project.grupo_economico.app.unidade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import personal.project.grupo_economico.app.unidade.provider.entity.UnidadeEntity;


@Repository
public interface UnidadeRepository extends JpaRepository<UnidadeEntity, String>{

    UnidadeEntity findByNomeFantasia(String nome);
}
