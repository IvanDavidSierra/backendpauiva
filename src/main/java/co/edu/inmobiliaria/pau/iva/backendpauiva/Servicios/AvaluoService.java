/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Avaluo;
import java.util.List;

public interface AvaluoService {
    List<Avaluo> listar();
    Avaluo listarId(int id);
    Avaluo add(Avaluo p);
    Avaluo edit(Avaluo p);
    Avaluo delete(int id);
}
