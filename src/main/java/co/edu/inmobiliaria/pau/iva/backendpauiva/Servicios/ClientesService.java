package co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Clientes;
import java.util.List;

public interface ClientesService {
    Clientes registrarCliente(Clientes cliente);
    Clientes registrarClientePymes(Clientes cliente);
    Clientes registrarClienteEmpresariales(Clientes cliente);
    Clientes obtenerClientePorCorreo(String correo);
    
    List<Clientes> listar();
    Clientes listarId(int id);
    Clientes add(Clientes p);
    Clientes edit(Clientes p);
    Clientes delete(int id);
}