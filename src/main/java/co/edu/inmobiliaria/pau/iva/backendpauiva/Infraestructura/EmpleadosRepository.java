package co.edu.inmobiliaria.pau.iva.backendpauiva.Infraestructura;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Empleados;
import org.springframework.data.repository.Repository;

public interface EmpleadosRepository extends Repository<Empleados, Integer>{
    Empleados findByCorreo(String correo);
}
