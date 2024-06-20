package co.edu.inmobiliaria.pau.iva.backendpauiva.Infraestructura;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.TipoInmueble;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface TipoInmuebleRepository extends Repository<TipoInmueble, Integer> {
    List<TipoInmueble> findAll();
    TipoInmueble findById(int id);
    TipoInmueble save(TipoInmueble p);
    void delete(TipoInmueble p);
}
