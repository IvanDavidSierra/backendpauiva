package co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Empleados;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Infraestructura.EmpleadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadosServiceImp implements EmpleadosService{
    @Autowired
    private EmpleadosRepository repositorio;
    @Override
    public Empleados obtenerClientePorCorreo(String correo) {
        return repositorio.findByCorreo(correo);
    }
}
