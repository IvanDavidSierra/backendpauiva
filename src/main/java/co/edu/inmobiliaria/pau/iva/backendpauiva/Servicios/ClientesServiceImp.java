package co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Clientes;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Infraestructura.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class ClientesServiceImp implements ClientesService{
    @Autowired
    ClientesRepository clientesRepository;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Clientes registrarCliente(Clientes cliente) {
        String sql = "INSERT INTO clientes (nombre, apellido, telefono, tipocliente, correo) VALUES (?, ?, ?, ?, ?)"; 
        jdbcTemplate.update(sql, cliente.getNombre(), cliente.getApellido(), cliente.getTelefono(), 1, cliente.getCorreo());
        
        return cliente;
    }
    
    
    @Override
    public Clientes registrarClientePymes(Clientes cliente){
        String sql = "INSERT INTO clientes (razon_social, nit, telefono, tipocliente, correo) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, cliente.getRazon_social(), cliente.getNit(), cliente.getTelefono(), 2, cliente.getCorreo());
        
        return cliente;
    }
    
    @Override
    public Clientes registrarClienteEmpresariales(Clientes cliente){
        String sql = "INSERT INTO clientes (razon_social, nit, telefono, tipocliente, correo) VALUES (?, ?, ?, ?, ?)";
        
        jdbcTemplate.update(sql, cliente.getRazon_social(), cliente.getNit(), cliente.getTelefono(), 3, cliente.getCorreo());
        
        return cliente;
    }
    
    
    
    @Override
    public Clientes obtenerClientePorCorreo(String correo) {
        return clientesRepository.findByCorreo(correo);
    }
}

