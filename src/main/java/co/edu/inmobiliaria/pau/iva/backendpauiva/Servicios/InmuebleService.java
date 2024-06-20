
package co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Inmueble;
import java.util.List;

public interface InmuebleService {
    List<Inmueble> listar();
    Inmueble listarId(int id);
    Inmueble add(Inmueble p);
    Inmueble edit(Inmueble p);
    Inmueble delete(int id);
}
