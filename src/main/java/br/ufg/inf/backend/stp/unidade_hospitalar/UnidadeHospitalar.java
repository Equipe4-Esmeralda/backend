package br.ufg.inf.backend.stp.unidade_hospitalar;

import java.util.List;

import br.ufg.inf.backend.stp.especialidade.Especialidade;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UnidadeHospitalar {
	private Long id;
	private String telefone;
	private String email;
	
	@OneToOne
	@JoinColumn(name = "endereco_id")
	private String endereco;
	private String dadosPessoal;
	private Double latitude;
	private Double longitude;
	private Integer disponibilidadeLeitos;
	
	@ManyToMany
	@JoinTable(
			name ="unidade_hospitalar_especialidades",
			joinColumns = @JoinColumn(name = "unidade_hospitalar_id"),
			inverseJoinColumns = @JoinColumn(name = "especialidade_id")
    )
	private List<Especialidade> especialidades;
	private boolean temUTI;

}
