package br.ufg.inf.backend.stp.paciente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {
    @Autowired
    private PacienteRepository repository;

    public List<Paciente> list(){
        return repository.findAll();
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public Paciente get(Long id){
        return repository.findById(id).orElse(null);
    }

    public Paciente save(Long id, Paciente paciente){
        paciente.setId(id);
        return repository.save(paciente);
    }

    public Paciente save(Paciente paciente){
        return repository.save(paciente);
    }

}
