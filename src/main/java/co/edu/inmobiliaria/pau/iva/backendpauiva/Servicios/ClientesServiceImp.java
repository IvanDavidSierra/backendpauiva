
package co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Clientes;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Infraestructura.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ClientesServiceImp implements ClientesService{
    @Autowired
    private ClientesRepository clienteRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    @Override
    public Clientes loginCliente(String correo, String password){
        Clientes cliente = clienteRepository.findByCorreo(correo);
        if(cliente != null && passwordEncoder.matches(password, cliente.getContraseña())){
            return cliente;
        }
        return null;
    }
   
    
}
