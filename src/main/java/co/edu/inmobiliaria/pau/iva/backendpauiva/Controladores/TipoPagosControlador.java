package co.edu.inmobiliaria.pau.iva.backendpauiva.Controladores;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.TipoPagos;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios.TipoPagosService;
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
@RequestMapping({"/tipopagos"})
public class TipoPagosControlador {
    @Autowired
    TipoPagosService service;
    
    @GetMapping("/submit")
    public List<TipoPagos> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public TipoPagos agregar(@RequestBody TipoPagos p){
        return service.add(p);
    }
    
    @GetMapping("/submit/{id}")
    public TipoPagos listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }
    
    @PutMapping("/submit/{id}")
    public TipoPagos  editar(@RequestBody TipoPagos p, @PathVariable("id") int id){
        p.setIdtipos(id);
        return service.edit(p);
    }
    @DeleteMapping("/submit/{id}") 
    public TipoPagos delete(@PathVariable("id") int id){
        return service.delete(id);
    }
}
