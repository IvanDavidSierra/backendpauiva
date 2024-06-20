
package co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.TipoPagos;
import java.util.List;
public interface TipoPagosService {
    List<TipoPagos> listar();
    TipoPagos listarId(int id);
    TipoPagos add(TipoPagos p);
    TipoPagos edit(TipoPagos p);
    TipoPagos delete(int id);
}
