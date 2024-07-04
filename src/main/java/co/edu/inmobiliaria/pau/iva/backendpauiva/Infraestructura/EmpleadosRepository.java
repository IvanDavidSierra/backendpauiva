package co.edu.inmobiliaria.pau.iva.backendpauiva.Infraestructura;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Empleados;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface EmpleadosRepository extends Repository<Empleados, Integer>{
    Empleados findByCorreo(String correo);
    List<Empleados> findAll();
    Empleados findById(int idempleado);
    Empleados save(Empleados p);
    void delete(Empleados p);
}
