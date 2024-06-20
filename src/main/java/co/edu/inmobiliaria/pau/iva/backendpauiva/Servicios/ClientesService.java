/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Clientes;
import java.util.List;

public interface ClientesService {
    List<Clientes> listar();
    Clientes listarId(int id);
    Clientes add(Clientes p);
    Clientes edit(Clientes p);
    Clientes delete(int id);
}
