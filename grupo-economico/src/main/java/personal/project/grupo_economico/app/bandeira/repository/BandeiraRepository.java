package personal.project.grupo_economico.app.bandeira.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import personal.project.grupo_economico.app.bandeira.provider.entity.BandeiraEntity;

@Repository
public interface BandeiraRepository extends JpaRepository<BandeiraEntity, String> {

    @Modifying
    @Transactional
    @Query("UPDATE BandeiraEntity b SET b.grupoEconomico.id = :novoGrupoEconomicoId WHERE b.id = :bandeiraId")
    int atualizarGrupoEconomico(@Param("bandeiraId") String bandeiraId, @Param("novoGrupoEconomicoId") String novoGrupoEconomicoId);

    BandeiraEntity findByNome(String nome);
}
