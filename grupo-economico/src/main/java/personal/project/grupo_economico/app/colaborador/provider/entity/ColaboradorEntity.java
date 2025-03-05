package personal.project.grupo_economico.app.colaborador.provider.entity;

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
import personal.project.grupo_economico.app.unidade.provider.entity.UnidadeEntity;

@Getter
@Setter
@Entity
@Table(name = "colaborador")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ColaboradorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(unique = true, nullable = true)
    private String nome;
    
    private String email;
    private String cpf;
    @ManyToOne
    @JoinColumn(name = "unidade_id", nullable = false)
    private UnidadeEntity unidade;
    
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
