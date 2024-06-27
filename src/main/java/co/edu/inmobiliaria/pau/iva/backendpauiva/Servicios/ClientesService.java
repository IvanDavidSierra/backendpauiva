package co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Clientes;

public interface ClientesService {
    Clientes registrarCliente(Clientes cliente);
    Clientes registrarClientePymes(Clientes cliente);
    Clientes registrarClienteEmpresariales(Clientes cliente);
    Clientes obtenerClientePorCorreo(String correo);
}