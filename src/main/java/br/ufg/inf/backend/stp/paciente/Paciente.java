package br.ufg.inf.backend.stp.paciente;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true) // CPF deve ser único
    private String cpf;

    private String dataNascimento;

    @Enumerated(EnumType.STRING)
    private Sexo sexo; // Sexo (MASCULINO, FEMININO)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String telefone;
    private String convenio;
    private String historicoMedico;
}
