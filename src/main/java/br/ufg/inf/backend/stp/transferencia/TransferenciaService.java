package br.ufg.inf.backend.stp.transferencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.Optional;

@Service
public class TransferenciaService {

    @Autowired
    private TransferenciaRepository transferenciaRepository;

    public List<Transferencia> listarTodasTransferencias() {
        return transferenciaRepository.findAll();
    }

    public Transferencia obterTransferenciaPorId(Long id) {
        return transferenciaRepository.findById(id).orElse(null);
    }

    public Transferencia criarTransferencia(Transferencia transferencia) {
        return transferenciaRepository.save(transferencia);
    }

    public Transferencia atualizarTransferencia(Long id, Transferencia transferencia) {
        transferencia.setId(id);
        return transferenciaRepository.save(transferencia);
    }

    public void excluirTransferencia(Long id) {
        transferenciaRepository.deleteById(id);
    }
}
