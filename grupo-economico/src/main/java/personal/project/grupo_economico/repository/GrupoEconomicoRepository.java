package personal.project.grupo_economico.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;
import personal.project.grupo_economico.entitys.GrupoEconomicoEntity;

@Repository
public interface GrupoEconomicoRepository extends JpaRepository<GrupoEconomicoEntity, String> {


    @Modifying
    @Transactional
    @Query("UPDATE GrupoEconomicoEntity e SET e.nome = :nome WHERE e.id = :id")
    void atualizarNome(@Param("id") String id, @Param("nome") String nome);

}
