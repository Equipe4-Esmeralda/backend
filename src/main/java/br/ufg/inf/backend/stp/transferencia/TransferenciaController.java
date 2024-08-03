package br.ufg.inf.backend.stp.transferencia;

import br.ufg.inf.backend.stp.medico.Medico;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transferencias")
public class TransferenciaController {

    @Autowired
    private TransferenciaService transferenciaService;

    @GetMapping
    public List<Transferencia> listarTransferencias() {
        return transferenciaService.listarTodasTransferencias();
    }

    @GetMapping("/{id}")
    public Transferencia obterTransferencia(@PathParam(value = "id") Long id) {
        return transferenciaService.obterTransferenciaPorId(id);
    }

    @PostMapping public Transferencia adicionarTransferencia(@RequestBody Transferencia transferencia) {
        return transferenciaService.criarTransferencia(transferencia);
    }

    @PutMapping("/{id}")
    public Transferencia atualizarTransferencia(@PathParam(value = "id") Long id, @RequestBody Transferencia transferencia) {
        return transferenciaService.atualizarTransferencia(id, transferencia);
    }

    @DeleteMapping("/{id}")
    public void excluirTransferencia(@PathParam(value = "id") Long id) {
        transferenciaService.excluirTransferencia(id);
    }
}
