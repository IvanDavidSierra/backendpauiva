package co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.apache.commons.codec.digest.DigestUtils;

@Service
public class ClientesServiceImp implements ClientesService{
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Clientes registrarCliente(Clientes cliente) {
        String sql = "INSERT INTO clientes (nombre, apellido, telefono, tipocliente, correo, password) VALUES (?, ?, ?, ?, ?, ?)";
        
        // Encriptar la contraseña usando MD5
        String contraseñaEncriptada = DigestUtils.md5Hex(cliente.getPassword());
        
        jdbcTemplate.update(sql, cliente.getNombre(), cliente.getApellido(), cliente.getTelefono(), 1, cliente.getCorreo(), contraseñaEncriptada);
        
        return cliente;
    }
    
    
    @Override
    public Clientes registrarClientePymes(Clientes cliente){
        String sql = "INSERT INTO clientes (razon_social, nit, telefono, tipocliente, correo, password) VALUES (?, ?, ?, ?, ?, ?)";
      
        // Encriptar la contraseña usando MD5
        String contraseñaEncriptada = DigestUtils.md5Hex(cliente.getPassword());
        
        jdbcTemplate.update(sql, cliente.getRazon_social(), cliente.getNit(), cliente.getTelefono(), 2, cliente.getCorreo(), contraseñaEncriptada);
        
        return cliente;
    }
    
    @Override
    public Clientes registrarClienteEmpresariales(Clientes cliente){
        String sql = "INSERT INTO clientes (razon_social, nit, telefono, tipocliente, correo, password) VALUES (?, ?, ?, ?, ?, ?)";
      
        // Encriptar la contraseña usando MD5
        String contraseñaEncriptada = DigestUtils.md5Hex(cliente.getPassword());
        
        jdbcTemplate.update(sql, cliente.getRazon_social(), cliente.getNit(), cliente.getTelefono(), 3, cliente.getCorreo(), contraseñaEncriptada);
        
        return cliente;
    }

    @Override
    public Clientes loginCliente(String correo, String contraseña) {
        String sql = "SELECT * FROM clientes WHERE correo = ? AND password = ?";

        // Encriptar la contraseña proporcionada para hacer la comparación en la base de datos
        String contraseñaEncriptada = DigestUtils.md5Hex(contraseña);

        return jdbcTemplate.queryForObject(sql, new Object[]{correo, contraseñaEncriptada},
            (rs, rowNum) -> {
                Clientes cliente = new Clientes();
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setCorreo(rs.getString("correo"));

                // Verificar si la contraseña de la base de datos no es nula o vacía antes de accederla
                String passwordBD = rs.getString("password");
                if (passwordBD != null && !passwordBD.isEmpty()) {
                    cliente.setPassword(passwordBD);
                } else {
                    // Manejar el caso de contraseña nula o vacía
                    System.out.println("Contraseña nula o vacía para el correo: " + correo);
                    return null; // Devolver null si la contraseña es nula o vacía
                }
                return cliente;
            });
    }
    
    @Override
    public Clientes obtenerClientePorCorreo(String correo) {
        String sql = "SELECT * FROM clientes WHERE correo = ?";
        try {
            return jdbcTemplate.queryForObject(sql, new Object[]{correo},
                    (rs, rowNum) -> {
                        Clientes cliente = new Clientes();
                        cliente.setIdcliente(rs.getInt("idcliente"));
                        cliente.setNombre(rs.getString("nombre"));
                        cliente.setApellido(rs.getString("apellido"));
                        cliente.setTelefono(rs.getInt("telefono"));
                        cliente.setCorreo(rs.getString("correo"));
                        cliente.setPassword(rs.getString("password"));
                        // Añadir más campos según sea necesario
                        return cliente;
                    });
        } catch (Exception e) {
            // Manejar la excepción, por ejemplo, loguearla
            return null; // Devolver null si no se encuentra el cliente
        }
    }
}

