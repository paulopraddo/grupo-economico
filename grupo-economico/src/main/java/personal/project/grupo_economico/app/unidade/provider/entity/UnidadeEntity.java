package personal.project.grupo_economico.app.unidade.provider.entity;

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
import personal.project.grupo_economico.app.bandeira.provider.entity.BandeiraEntity;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "unidade")
public class UnidadeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = true, unique = true)
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;

    @ManyToOne
    @JoinColumn(name = "bandeira_id", nullable = false)
    private BandeiraEntity bandeira;

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
