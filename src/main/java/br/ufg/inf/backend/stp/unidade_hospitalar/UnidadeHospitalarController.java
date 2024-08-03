package br.ufg.inf.backend.stp.unidade_hospitalar;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/unidade-hospitalar")
public class UnidadeHospitalarController {

    @Autowired
    private UnidadeHospitalarService service;

    @GetMapping
    public List<UnidadeHospitalar> listarUnidadesHospitalares(){
        return service.listarUnidadesHospitalares();
    }

    @GetMapping("/{id}")
    public UnidadeHospitalar obterUnidadeHospitalar(@PathParam(value = "id") Long id){
        return service.obterUnidadeHospitalar(id);
    }

    @PostMapping
    public UnidadeHospitalar adicionarUnidadeHospitalar(@RequestBody UnidadeHospitalar unidadeHospitalar){
        return service.adicionarUnidadeHospitalar(unidadeHospitalar);
    }

    @PutMapping("/{id}")
    public UnidadeHospitalar atualizarUnidadeHospitalar(@PathParam(value = "id") Long id, @RequestBody UnidadeHospitalar unidadeHospitalar){
        return service.atualizarUnidadeHospitalar(id, unidadeHospitalar);
    }

}
