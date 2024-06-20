package co.edu.inmobiliaria.pau.iva.backendpauiva.Controladores;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Clientes;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios.ClientesService;
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
@RequestMapping({"/clientes"})
public class ClientesControlador {
    @Autowired
    ClientesService service;
    
    @GetMapping("/submit")
    public List<Clientes> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public Clientes agregar(@RequestBody Clientes p){
        return service.add(p);
    }
    
    @GetMapping("/submit/{id}")
    public Clientes listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }
    
    @PutMapping("/submit/{id}")
    public Clientes  editar(@RequestBody Clientes p, @PathVariable("id") int id){
        p.setIdcliente(id);
        return service.edit(p);
    }
    @DeleteMapping("/submit/{id}") 
    public Clientes delete(@PathVariable("id") int id){
        return service.delete(id);
    }
}
