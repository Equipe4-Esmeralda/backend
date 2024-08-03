package br.ufg.inf.backend.stp.medicamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicamentoService {
    @Autowired
    private MedicamentoRepository repository;

    public List<Medicamento> listarMedicamentos(){
        return repository.findAll();
    }

    public Medicamento obterMedicamento(Long id){
        return repository.findById(id).orElse(null);
    }

    public Medicamento adicionarMedicamento(Medicamento medicamento){
        return repository.save(medicamento);
    }

    public Medicamento atualizarMedicamento(Long id, Medicamento medicamento){
        medicamento.setId(id);
        return repository.save(medicamento);
    }

    public void excluirMedicamento(Long id){
        repository.deleteById(id);
    }

}
