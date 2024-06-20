package co.edu.inmobiliaria.pau.iva.backendpauiva.Infraestructura;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.TipoPagos;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface TipoPagosRepository extends Repository<TipoPagos, Integer>{
    List<TipoPagos> findAll();
    TipoPagos findById(int id);
    TipoPagos save(TipoPagos p);
    void delete(TipoPagos p);
}
