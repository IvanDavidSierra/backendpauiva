package co.edu.inmobiliaria.pau.iva.backendpauiva.Infraestructura;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Avaluo;
import org.springframework.data.repository.Repository;
import java.util.List;

public interface AvaluoRepository extends Repository<Avaluo, Integer> {
    List<Avaluo> findAll();
    Avaluo findById(int id);
    Avaluo save(Avaluo p);
    void delete(Avaluo p);
}
