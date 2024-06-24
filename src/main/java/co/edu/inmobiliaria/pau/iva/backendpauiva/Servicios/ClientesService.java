package co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Clientes;

public interface ClientesService {
    Clientes obtenerClientePorCorreo(String correo);
    Clientes registrarCliente(Clientes cliente);
    Clientes loginCliente(String correo, String contraseña);
    Clientes registrarClientePymes(Clientes cliente);
    Clientes registrarClienteEmpresariales(Clientes cliente);
}