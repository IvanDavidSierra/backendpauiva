package co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Clientes;

public interface ClientesService {
    Clientes registrarCliente(Clientes cliente);
    Clientes loginCliente(String correo, String contraseña);
}