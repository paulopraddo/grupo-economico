package personal.project.grupo_economico.app.colaborador.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import personal.project.grupo_economico.app.unidade.entity.UnidadeEntity;

@Getter
@Entity
@Table(name = "colaborador")
public class ColaboradorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String nome;
    private String email;
    private String cpf;
    @ManyToOne
    @JoinColumn(name = "unidade_id", nullable = false)
    private UnidadeEntity unidade;
    private LocalDate dataDeCriacao;
    private LocalDateTime dataUltimaAtualizacao;
}
