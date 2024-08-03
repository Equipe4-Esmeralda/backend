package br.ufg.inf.backend.stp.medicamento;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicamentos")
public class MedicamentoController {

    @Autowired
    private MedicamentoService service;

    @GetMapping
    private List<Medicamento> listarMedicamentos(){
        return service.listarMedicamentos();
    }

    @GetMapping("/{id}")
    private Medicamento obterMedicamento(@PathParam(value = "id") Long id){
        return service.obterMedicamento(id);
    }

    @PostMapping
    private Medicamento adicionarMedicamento(@RequestBody Medicamento medicamento){
        return service.adicionarMedicamento(medicamento);
    }

    @PutMapping("/{id}")
    private Medicamento atualizarMedicamento(@PathParam(value = "id") Long id, @RequestBody Medicamento medicamento){
        return service.atualizarMedicamento(id, medicamento);
    }

    @DeleteMapping("/{id}")
    private void excluirMedicamento(@PathParam(value = "id") Long id){
        service.excluirMedicamento(id);
    }
}
