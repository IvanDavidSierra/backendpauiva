package co.edu.inmobiliaria.pau.iva.backendpauiva.Controladores;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Clientes;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios.ClientesService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/clientes"})
public class ClientesControlador {
    @Autowired
    private ClientesService clientesService;
   

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
    
    @GetMapping("/profile")
    public ResponseEntity<?> obtenerPerfilCliente(String correo) {
        Clientes cliente = clientesService.obtenerClientePorCorreo(correo);
        if (cliente != null) {
            return ResponseEntity.ok(cliente);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente no encontrado");
        }
    }
    
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Clientes cliente) {
        // Aquí asumimos que 'cliente' contiene al menos el correo y la contraseña
        Clientes authenticatedCliente = clientesService.login(cliente.getCorreo(), cliente.getPassword());
        
        if (authenticatedCliente != null) {
            return ResponseEntity.ok(authenticatedCliente);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciales inválidas");
        }
    }
}
