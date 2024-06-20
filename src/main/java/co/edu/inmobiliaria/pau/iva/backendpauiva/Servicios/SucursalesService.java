/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Sucursales;
import java.util.List;

/**
 *
 * @author Iván
 */
public interface SucursalesService {
    List<Sucursales> listar();
    Sucursales listarId(int id);
    Sucursales add(Sucursales p);
    Sucursales edit(Sucursales p);
    Sucursales delete(int id); 
}
