package personal.project.grupo_economico.app.bandeira.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import personal.project.grupo_economico.app.bandeira.provider.entity.BandeiraEntity;

@Repository
public interface BandeiraRepository extends JpaRepository<BandeiraEntity, String> {

    BandeiraEntity findByNome(String nome);

    @Transactional
    void deleteByNome(String nome);
}
