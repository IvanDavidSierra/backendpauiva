package co.edu.inmobiliaria.pau.iva.backendpauiva.Infraestructura;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Pagos;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface PagosRepository extends Repository<Pagos, Integer>{
    List<Pagos> findAll();
    Pagos findById(int id);
    Pagos save(Pagos p);
    void delete(Pagos p);
    
}
