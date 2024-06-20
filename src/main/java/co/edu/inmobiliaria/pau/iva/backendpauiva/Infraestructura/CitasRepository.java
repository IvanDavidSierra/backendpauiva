package co.edu.inmobiliaria.pau.iva.backendpauiva.Infraestructura;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Citas;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface CitasRepository extends Repository<Citas, Integer>{
    List<Citas> findAll();
    Citas findById(int id);
    Citas save(Citas p);
    void delete(Citas p);
}
