package br.ufg.inf.backend.stp.paciente;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    private PacienteService service;

    @GetMapping
    public List<Paciente> listarPacientes(){
        return service.list();
    }

    @GetMapping("/{id}")
    public Paciente obterPaciente(@PathParam(value = "id") Long id){
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void excluirPaciente(@PathParam(value = "id") Long id){
        service.delete(id);
    }

    @PostMapping
    public Paciente adicionarPaciente(@RequestBody Paciente paciente){
        return service.save(paciente);
    }

    @PutMapping("/{id}")
    public Paciente atualizarPaciente(@PathParam(value = "id") Long id, @RequestBody Paciente paciente){
        return service.save(id, paciente);
    }
}
