/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.TipoEmpleado;
import java.util.List;

/**
 *
 * @author Iván
 */
public interface TipoEmpleadoService {
    List<TipoEmpleado> listar();
    TipoEmpleado listarId(int id);
    TipoEmpleado add(TipoEmpleado p);
    TipoEmpleado edit(TipoEmpleado p);
    TipoEmpleado delete(int id);
}
