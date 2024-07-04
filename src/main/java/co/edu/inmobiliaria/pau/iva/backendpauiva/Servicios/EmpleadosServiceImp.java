package co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Empleados;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Infraestructura.EmpleadosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadosServiceImp implements EmpleadosService{
    @Autowired
    private EmpleadosRepository repositorio;

    @Override
    public List<Empleados> listar() {
        return repositorio.findAll();
    }

    @Override
    public Empleados listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Empleados add(Empleados p) {
        return repositorio.save(p);
    }

    @Override
    public Empleados edit(Empleados p) {
        return repositorio.save(p);
    }

    @Override
    public Empleados delete(int id) {
        Empleados p = repositorio.findById(id);
        if (p != null) {
            repositorio.delete(p);
        }
        return p;
    }

    @Override
    public Empleados obtenerEmpleadoPorCorreo(String correo) {
        return repositorio.findByCorreo(correo);
    }
    
}
