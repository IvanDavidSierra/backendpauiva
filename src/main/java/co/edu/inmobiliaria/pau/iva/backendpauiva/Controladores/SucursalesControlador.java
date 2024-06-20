package co.edu.inmobiliaria.pau.iva.backendpauiva.Controladores;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Sucursales;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios.SucursalesService;
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
@RequestMapping({"/sucursales"})
public class SucursalesControlador {
        @Autowired
    SucursalesService service;
    
    @GetMapping("/submit")
    public List<Sucursales> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public Sucursales agregar(@RequestBody Sucursales p){
        return service.add(p);
    }
    
    @GetMapping("/submit/{id}")
    public Sucursales listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }
    
    @PutMapping("/submit/{id}")
    public Sucursales  editar(@RequestBody Sucursales p, @PathVariable("id") int id){
        p.setIdsucursales(id);
        return service.edit(p);
    }
    @DeleteMapping("/submit/{id}") 
    public Sucursales delete(@PathVariable("id") int id){
        return service.delete(id);
    }
}
