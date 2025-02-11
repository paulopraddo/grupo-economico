package personal.project.grupo_economico.entitys;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    private LocalDate dataDeCriacao;
    private LocalDateTime ultimaAtualizacao;
}
