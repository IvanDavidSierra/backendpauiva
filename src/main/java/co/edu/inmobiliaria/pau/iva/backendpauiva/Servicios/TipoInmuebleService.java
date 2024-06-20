/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.TipoInmueble;
import java.util.List;

/**
 *
 * @author Iván
 */
public interface TipoInmuebleService {
    List<TipoInmueble> listar();
    TipoInmueble listarId(int id);
    TipoInmueble add(TipoInmueble p);
    TipoInmueble edit(TipoInmueble p);
    TipoInmueble delete(int id);
}
