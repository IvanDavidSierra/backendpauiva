package co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.TipoCliente;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface TipoClienteService {
    List<TipoCliente> listar();
    TipoCliente listarId(int id);
    TipoCliente add(TipoCliente p);
    TipoCliente edit(TipoCliente p);
    TipoCliente delete(int id);
}

