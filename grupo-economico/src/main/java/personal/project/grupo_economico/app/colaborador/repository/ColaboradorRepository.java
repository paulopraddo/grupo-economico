package personal.project.grupo_economico.app.colaborador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import personal.project.grupo_economico.app.colaborador.provider.entity.ColaboradorEntity;

@Repository
public interface ColaboradorRepository extends JpaRepository<ColaboradorEntity, String> {

    ColaboradorEntity findByNome(String nome);
}
