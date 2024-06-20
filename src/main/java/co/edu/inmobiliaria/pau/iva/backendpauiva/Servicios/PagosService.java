package co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Pagos;
import java.util.List;
public interface PagosService {
    List<Pagos> listar();
    Pagos listarId(int id);
    Pagos add(Pagos p);
    Pagos edit(Pagos p);
    Pagos delete(int id);
}
