package co.edu.inmobiliaria.pau.iva.backendpauiva.Controladores;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Empleados;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios.*;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/empleados"})
public class EmpleadosControlador {
    @Autowired
    EmpleadosService service;
    
    
    
    
    @PostMapping("/login")
    public ResponseEntity<Empleados> login(@RequestBody Map<String, String> loginData) {
        String correo = loginData.get("correo");
        Empleados empleado = service.obtenerEmpleadoPorCorreo(correo);
        if (empleado!= null) {
            return ResponseEntity.ok(empleado);
        } else {
            return ResponseEntity.status(401).build();
        }
    }
    
    @GetMapping("/profile")
    public ResponseEntity<?> obtenerPerfilCliente(@RequestParam String correo) {
        Empleados empleado = service.obtenerEmpleadoPorCorreo(correo);
        if (empleado != null) {
            return ResponseEntity.ok(empleado);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente no encontrado");
        }
    }  
    
    
    
    @GetMapping("/submit")
    public List<Empleados> obtenerEmpleados() {
      return service.listar();
    }
 
    @PostMapping("/submit")
    public Empleados agregar(@RequestBody Empleados p){
        return service.add(p);
    }
    
    @GetMapping("/submit/{id}")
    public Empleados listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }
    
    @PutMapping("/submit/{id}")
    public Empleados  editar(@RequestBody Empleados p, @PathVariable("id") int id){
        p.setIdempleado(id);
        return service.edit(p);
    }
    
    @DeleteMapping("/submit/{id}") 
    public Empleados delete(@PathVariable("id") int id){
        return service.delete(id);
    }

}
