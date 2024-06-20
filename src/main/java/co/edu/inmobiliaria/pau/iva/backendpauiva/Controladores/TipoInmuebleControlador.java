package co.edu.inmobiliaria.pau.iva.backendpauiva.Controladores;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.TipoInmueble;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios.TipoInmuebleService;
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
@RequestMapping({"/tipoinmueble"})
public class TipoInmuebleControlador {
    @Autowired
    TipoInmuebleService service;
    
    @GetMapping("/submit")
    public List<TipoInmueble> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public TipoInmueble agregar(@RequestBody TipoInmueble p){
        return service.add(p);
    }
    
    @GetMapping("/submit/{id}")
    public TipoInmueble listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }
    
    @PutMapping("/submit/{id}")
    public TipoInmueble  editar(@RequestBody TipoInmueble p, @PathVariable("id") int id){
        p.setIdtipoinmueble(id);
        return service.edit(p);
    }
    @DeleteMapping("/submit/{id}") 
    public TipoInmueble delete(@PathVariable("id") int id){
        return service.delete(id);
    }
}
