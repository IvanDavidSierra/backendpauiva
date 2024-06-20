package co.edu.inmobiliaria.pau.iva.backendpauiva.Controladores;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Citas;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios.CitasService;
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
@RequestMapping({"/citas"})
public class CitasControlador {
    @Autowired
    CitasService service;
    
    @GetMapping("/submit")
    public List<Citas> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public Citas agregar(@RequestBody Citas p){
        return service.add(p);
    }
    
    @GetMapping("/submit/{id}")
    public Citas listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }
    
    @PutMapping("/submit/{id}")
    public Citas  editar(@RequestBody Citas p, @PathVariable("id") int id){
        p.setIdcitas(id);
        return service.edit(p);
    }
    @DeleteMapping("/submit/{id}") 
    public Citas delete(@PathVariable("id") int id){
        return service.delete(id);
    }
}
