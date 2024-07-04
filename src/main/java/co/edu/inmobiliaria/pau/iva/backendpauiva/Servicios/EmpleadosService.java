package co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Empleados;
import java.util.List;


public interface EmpleadosService {
    List<Empleados> listar();
    Empleados listarId(int id);
    Empleados add(Empleados p);
    Empleados edit(Empleados p);
    Empleados delete(int id);
    Empleados obtenerEmpleadoPorCorreo(String correo);
}
