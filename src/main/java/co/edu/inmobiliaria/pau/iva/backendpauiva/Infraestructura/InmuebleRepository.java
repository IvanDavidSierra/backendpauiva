package co.edu.inmobiliaria.pau.iva.backendpauiva.Infraestructura;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Inmueble;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface InmuebleRepository extends Repository<Inmueble, Integer>{
    List<Inmueble> findAll();
    Inmueble findById(int id);
    Inmueble save(Inmueble p);
    void delete(Inmueble p);
    
}
