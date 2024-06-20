/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Empleados;
import java.util.List;
public interface EmpleadosService {
    List<Empleados> listar();
    Empleados listarId(int id);
    Empleados add(Empleados p);
    Empleados edit(Empleados p);
    Empleados delete(int id);
}
