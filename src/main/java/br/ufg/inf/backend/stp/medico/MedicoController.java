package br.ufg.inf.backend.stp.medico;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medico")
public class MedicoController {

    @Autowired
    private MedicoService service;

    @GetMapping
    public List<Medico> listarMedicos(){
        return service.list();
    }

    @GetMapping("/{id}")
    public Medico obterMedico(@PathParam(value = "id") Long medicoId){
        return service.get(medicoId);
    }

    @DeleteMapping("/{id}")
    public void excluirMedico(@PathParam(value = "id") Long medicoId){
        service.delete(medicoId);
    }

    @PostMapping
    public Medico adicionarMedico(@RequestBody Medico medico){
        return service.save(medico);
    }

    @PutMapping("/{id}")
    public Medico atualizarMedico(@PathParam(value = "id") Long medicoId, @RequestBody Medico medico){
        return service.save(medicoId, medico);
    }
}
