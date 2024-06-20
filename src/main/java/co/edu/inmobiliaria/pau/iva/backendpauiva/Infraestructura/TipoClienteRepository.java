package co.edu.inmobiliaria.pau.iva.backendpauiva.Infraestructura;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.TipoCliente;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface TipoClienteRepository extends Repository<TipoCliente, Integer>{
    List<TipoCliente> findAll();
    TipoCliente findById(int id);
    TipoCliente save(TipoCliente p);
    void delete(TipoCliente p);
}

