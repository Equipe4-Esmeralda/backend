package br.ufg.inf.backend.stp.solicitacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SolicitacaoService {

    @Autowired
    private SolicitacaoRepository solicitacaoRepository;

    public List<Solicitacao> listarTodasSolicitacoes() {
        return solicitacaoRepository.findAll();
    }

    public Solicitacao obterSolicitacaoPorId(Long id) {
        return solicitacaoRepository.findById(id).orElse(null);
    }

    public void excluirSolicitacao(Long id) {
        solicitacaoRepository.deleteById(id);
    }

    public Solicitacao atualizarSolicitacao(Long id, Solicitacao solicitacao){
        solicitacao.setId(id);
        return solicitacaoRepository.save(solicitacao);
    }

    public Solicitacao criarSolicitacao(Solicitacao solicitacao) {
        return solicitacaoRepository.save(solicitacao);
    }

}

