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
import lombok.Getter;

@Getter
@Entity
@Table(name = "unidade")
public class UnidadeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    @ManyToOne
    @JoinColumn(name = "bandeira_id", nullable = false)
    private BandeiraEntity bandeira;
    private LocalDate dataDeCriacao;
    private LocalDateTime ultimaAtualizacao;

}
