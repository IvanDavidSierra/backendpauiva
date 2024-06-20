
package co.edu.inmobiliaria.pau.iva.backendpauiva.Controladores;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Pagos;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios.PagosService;
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
@RequestMapping({"/pagos"})
public class PagosControlador {
        @Autowired
    PagosService service;
    
    @GetMapping("/submit")
    public List<Pagos> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public Pagos agregar(@RequestBody Pagos p){
        return service.add(p);
    }
    
    @GetMapping("/submit/{id}")
    public Pagos listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }
    
    @PutMapping("/submit/{id}")
    public Pagos  editar(@RequestBody Pagos p, @PathVariable("id") int id){
        p.setIdpagos(id);
        return service.edit(p);
    }
    @DeleteMapping("/submit/{id}") 
    public Pagos delete(@PathVariable("id") int id){
        return service.delete(id);
    }
}
