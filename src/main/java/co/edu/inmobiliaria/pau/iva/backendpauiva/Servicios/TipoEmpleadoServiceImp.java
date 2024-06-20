/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.TipoEmpleado;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Infraestructura.TipoEmpleadoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoEmpleadoServiceImp implements TipoEmpleadoService{
    @Autowired
    private TipoEmpleadoRepository repositorio;
    
    @Override
    public List<TipoEmpleado> listar(){
        return repositorio.findAll();
    }

    @Override
    public TipoEmpleado listarId(int id) {
        return repositorio.findById(id);
    }
    
    @Override
    public TipoEmpleado add(TipoEmpleado p) {
        return repositorio.save(p);
    }

    @Override    
    public TipoEmpleado edit(TipoEmpleado p) {
        return repositorio.save(p);
    }

    @Override   
    public TipoEmpleado delete(int id) {
        TipoEmpleado p = repositorio.findById(id);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
}
