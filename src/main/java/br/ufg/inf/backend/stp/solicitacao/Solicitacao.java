package br.ufg.inf.backend.stp.solicitacao;

import br.ufg.inf.backend.stp.medico.Medico;
import br.ufg.inf.backend.stp.paciente.Paciente;
import br.ufg.inf.backend.stp.transferencia.Transferencia;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Solicitacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "medico_id")
    private Medico medicoOrigem;
    public Medico getMedicoOrigem() {
        return medicoOrigem;
    }
    public void setMedicoOrigem(Medico medico) {
        this.medicoOrigem = medico;
    }

    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @OneToOne(mappedBy = "solicitacao") // Relacionamento 1:1 com Transferencia
    private Transferencia transferencia;

    public Transferencia getTransferencia() {
        return transferencia;
    }
    public void setTransferencia(Transferencia transferencia) {
        this.transferencia = transferencia;
    }

    private Date dataSolicitacao;

    public Date getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(Date dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    @Enumerated(EnumType.STRING)
    private StatusSolicitacao status; // Status da solicitação (PENDENTE, APROVADA, REJEITADA)

    public StatusSolicitacao getStatus() {
        return status;
    }
    public void setStatus(StatusSolicitacao status) {
        this.status = status;
    }

    @Column(length = 500) // Tamanho máximo da justificativa
    private String justificativa;
    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }
    public String getJustificativa() {
        return justificativa;
    }

    @Enumerated(EnumType.STRING)
    private Prioridade prioridade; // Prioridade da transferência (BAIXA, MEDIA, ALTA)
    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }
    public Prioridade getPrioridade() {
        return prioridade;
    }

    private Date dataAprovacao;
    public Date getDataAprovacao() {
        return dataAprovacao;
    }
    public void setDataAprovacao(Date dataAprovacao) {
        this.dataAprovacao = dataAprovacao;
    }

    @Column(length = 500) // Tamanho máximo do motivo da recusa
    private String motivoRecusa;
    public String getMotivoRecusa() {
        return motivoRecusa;
    }
    public void setMotivoRecusa(String motivoRecusa) {
        this.motivoRecusa = motivoRecusa;
    }
}