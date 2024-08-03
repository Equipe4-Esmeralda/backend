package br.ufg.inf.backend.stp.medico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository repository;

    public List<Medico> list() {
        return repository.findAll();
    }

    public Medico get(Long medicoId) {
        return repository.findById(medicoId).orElse(null);
    }

    public void delete(Long medicoId) {
        repository.deleteById(medicoId);
    }

    public Medico save(Long medicoId, Medico medico) {
        medico.setId(medicoId);
        return repository.save(medico);
    }

    public Medico save(Medico medico) {
        return repository.save(medico);
    }
}
