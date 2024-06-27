package co.edu.inmobiliaria.pau.iva.backendpauiva.Controladores;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Clientes;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Infraestructura.ClientesRepository;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios.ClientesService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/clientes"})
public class ClientesControlador {
    @Autowired
    private ClientesService clientesService;
    
    @Autowired
    private ClientesRepository clientesRepository;
   
    @PostMapping("/register")
    public ResponseEntity<?> registrarCliente(@RequestBody Clientes cliente) {
        Clientes nuevoCliente = clientesService.registrarCliente(cliente);
        return ResponseEntity.ok(nuevoCliente);
    }
    
    @PostMapping("/register-pymes")
    public ResponseEntity<?> registrarClientePymes(@RequestBody Clientes cliente) {
        Clientes nuevoCliente = clientesService.registrarClientePymes(cliente);
        return ResponseEntity.ok(nuevoCliente);
    }
    
    @PostMapping("/register-empresariales")
    public ResponseEntity<?> registrarClienteEmpresariales(@RequestBody Clientes cliente) {
        Clientes nuevoCliente = clientesService.registrarClienteEmpresariales(cliente);
        return ResponseEntity.ok(nuevoCliente);
    }
    
    @PostMapping("/login")
    public ResponseEntity<Clientes> login(@RequestBody Map<String, String> loginData) {
        String correo = loginData.get("correo");
        Clientes cliente = clientesService.obtenerClientePorCorreo(correo);
        if (cliente != null) {
            return ResponseEntity.ok(cliente);
        } else {
            return ResponseEntity.status(401).build();
        }
    }
    
    
    @GetMapping("/profile")
    public ResponseEntity<?> obtenerPerfilCliente(@RequestParam String correo) {
        Clientes cliente = clientesService.obtenerClientePorCorreo(correo);
        if (cliente != null) {
            return ResponseEntity.ok(cliente);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente no encontrado");
        }
    }  

}
