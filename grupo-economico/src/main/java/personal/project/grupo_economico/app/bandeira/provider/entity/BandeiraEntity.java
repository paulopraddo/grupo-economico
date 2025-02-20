package personal.project.grupo_economico.app.bandeira.provider.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import personal.project.grupo_economico.app.grupoEconomico.provider.entity.GrupoEconomicoEntity;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "bandeira")
@Builder
public class BandeiraEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String nome;
    @ManyToOne
    @JoinColumn(name = "grupo_economico_id", nullable = false)
    private GrupoEconomicoEntity grupoEconomico;

    @Column(nullable = false, updatable = false)
    private LocalDate dataDeCriacao;
    private LocalDateTime ultimaAtualizacao;

    @PrePersist
    protected void onCreate() {
        if (dataDeCriacao == null) {
            dataDeCriacao = LocalDate.now();
        }
    }

    @PreUpdate
    protected void onUpdate() {
        ultimaAtualizacao = LocalDateTime.now();
    }
}
