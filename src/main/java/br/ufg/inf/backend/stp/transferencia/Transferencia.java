package br.ufg.inf.backend.stp.transferencia;

import java.util.Date;
import java.util.List;

import br.ufg.inf.backend.stp.medicamento.Medicamento;
import br.ufg.inf.backend.stp.solicitacao.Solicitacao;
import br.ufg.inf.backend.stp.unidade_hospitalar.UnidadeHospitalar;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Transferencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne // Relacionamento 1:1 com br.ufg.inf.backend.stp.solicitacaotransferencia.Solicitacao
    @JoinColumn(name = "solicitacao_id")
    private Solicitacao solicitacao;

    @Enumerated(EnumType.STRING)
    @Column(name = "meio_transporte", length = 20)
    private MeioTransporte meioTransporte;

    @ManyToOne
    @JoinColumn(name = "destino_id")
    private UnidadeHospitalar destino;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "origem_id")
    private UnidadeHospitalar origem;

    public MeioTransporte getMeioTransporte() {
        return meioTransporte;
    }

    public void setMeioTransporte(MeioTransporte meioTransporte) {
        this.meioTransporte = meioTransporte;
    }

    @Enumerated(EnumType.STRING)
    private ClassificacaoTransferencia classificacao;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "transferencia_id")
    private List<Medicamento> medicamentos;

    @Lob
    private String procedimentosAcondicionamento;

    @Lob
    private String procedimentosUnidadeDestino;

    private Date horarioSaida;
    private Date horarioPrevistoChegada;
    private Double distancia;

    @Enumerated(EnumType.STRING)
    private StatusTransferencia status;

}
