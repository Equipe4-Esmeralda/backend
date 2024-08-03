package br.ufg.inf.backend.stp.solicitacao;

import br.ufg.inf.backend.stp.endereco.Endereco;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/solicitacoes-transferencia")
public class SolicitacaoController {

    @Autowired
    private SolicitacaoService solicitacaoservice;

    @GetMapping
    public List<Solicitacao> listarSolicitacoes(){
        return solicitacaoservice.listarTodasSolicitacoes();
    }

    @GetMapping("/{id}")
    public Solicitacao obterSolicitacao(@PathParam(value = "id") Long id){
        return solicitacaoservice.obterSolicitacaoPorId(id);
    }

    @DeleteMapping("/{id}")
    public void excluirSolicitacao(@PathParam(value = "id") Long id){
        solicitacaoservice.excluirSolicitacao(id);
    }

    @PostMapping
    public Solicitacao adicionarSolicitacao(@RequestBody Solicitacao solicitacao){
        return solicitacaoservice.criarSolicitacao(solicitacao);
    }

    @PutMapping("/{id}")
    public Solicitacao atualizarSolicitacao(@PathParam(value = "id") Long id, @RequestBody Solicitacao solicitacao){
        return solicitacaoservice.atualizarSolicitacao(id, solicitacao);
    }

}
