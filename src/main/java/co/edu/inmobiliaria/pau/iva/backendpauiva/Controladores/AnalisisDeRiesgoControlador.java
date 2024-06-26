package co.edu.inmobiliaria.pau.iva.backendpauiva.Controladores;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.AnalisisDeRiesgo;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios.AnalisisDeRiesgoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/analisisderiesgo"})
public class AnalisisDeRiesgoControlador {
    @Autowired
    AnalisisDeRiesgoService service;
    
    @GetMapping("/submit")
    public List<AnalisisDeRiesgo> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public AnalisisDeRiesgo agregar(@RequestBody AnalisisDeRiesgo p){
        return service.add(p);
    }
    
    @GetMapping("/submit/{id}")
    public AnalisisDeRiesgo listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }
    
    @PutMapping("/submit/{id}")
    public AnalisisDeRiesgo  editar(@RequestBody AnalisisDeRiesgo p, @PathVariable("id") int id){
        p.setIdanalisis(id);
        return service.edit(p);
    }
    @DeleteMapping("/submit/{id}") 
    public AnalisisDeRiesgo delete(@PathVariable("id") int id){
        return service.delete(id);
    } 
}
