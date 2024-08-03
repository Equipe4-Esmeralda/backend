package br.ufg.inf.backend.stp.unidade_hospitalar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnidadeHospitalarService {
    @Autowired
    private UnidadeHospitalarRepository repository;

    public List<UnidadeHospitalar> listarUnidadesHospitalares(){
        return repository.findAll();
    }

    public UnidadeHospitalar obterUnidadeHospitalar(Long id){
        return repository.findById(id).orElse(null);
    }

    public UnidadeHospitalar adicionarUnidadeHospitalar(UnidadeHospitalar unidadeHospitalar){
        return repository.save(unidadeHospitalar);
    }

    public UnidadeHospitalar atualizarUnidadeHospitalar(Long id, UnidadeHospitalar unidadeHospitalar){
        return repository.save(unidadeHospitalar);
    }

    public void excluirUnidadeHospitalar(Long id){
        repository.deleteById(id);
    }
}
