package personal.project.grupo_economico.entitys;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.UuidGenerator;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@Setter
@Table(name = "grupo_economico")
@Builder
@NoArgsConstructor
public class GrupoEconomicoEntity {

   
    @Id
    @UuidGenerator
    private String id;
    
    @Nonnull
    @Column(nullable = false)
    private String nome;

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
