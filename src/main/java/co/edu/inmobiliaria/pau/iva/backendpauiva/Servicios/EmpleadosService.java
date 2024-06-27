/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Empleados;
public interface EmpleadosService {
    Empleados obtenerClientePorCorreo(String correo);
}
