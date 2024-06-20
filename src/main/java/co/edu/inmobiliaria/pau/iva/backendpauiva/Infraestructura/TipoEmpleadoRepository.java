package co.edu.inmobiliaria.pau.iva.backendpauiva.Infraestructura;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.TipoEmpleado;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface TipoEmpleadoRepository extends Repository<TipoEmpleado, Integer> {
    List<TipoEmpleado> findAll();
    TipoEmpleado findById(int id);
    TipoEmpleado save(TipoEmpleado p);
    void delete(TipoEmpleado p);
}
