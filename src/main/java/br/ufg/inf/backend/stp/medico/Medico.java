package br.ufg.inf.backend.stp.medico;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true) // CRM deve ser único
    private String crm;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;
    private String telefone;
    private String email;

    @Enumerated(EnumType.STRING)
    private PapelMedico papel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
