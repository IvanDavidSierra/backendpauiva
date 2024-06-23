package co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class ClientesServiceImp implements ClientesService{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public Clientes registrarCliente(Clientes cliente) {
        String sql = "INSERT INTO clientes (nombre, apellido, correo, contraseña) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, cliente.getNombre(), cliente.getApellido(), cliente.getCorreo(), cliente.getContraseña());
        return cliente;
    }
    @Override
    public Clientes loginCliente(String correo, String contraseña) {
        String sql = "SELECT * FROM clientes WHERE correo = ? AND contraseña = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{correo, contraseña},
                (rs, rowNum) -> {
                    Clientes cliente = new Clientes();
                    cliente.setNombre(rs.getString("nombre"));
                    cliente.setApellido(rs.getString("apellido"));
                    cliente.setCorreo(rs.getString("correo"));
                    cliente.setContraseña(rs.getString("contraseña"));
                    return cliente;
                });
    }
}

