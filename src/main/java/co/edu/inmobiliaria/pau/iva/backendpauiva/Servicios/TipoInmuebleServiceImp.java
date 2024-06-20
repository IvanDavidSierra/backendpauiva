/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.TipoInmueble;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Infraestructura.TipoInmuebleRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoInmuebleServiceImp implements TipoInmuebleService{
    @Autowired
    private TipoInmuebleRepository repositorio;
    
    @Override
    public List<TipoInmueble> listar(){
        return repositorio.findAll();
    }

    @Override
    public TipoInmueble listarId(int id) {
        return repositorio.findById(id);
    }
    
    @Override
    public TipoInmueble add(TipoInmueble p) {
        return repositorio.save(p);
    }

    @Override    
    public TipoInmueble edit(TipoInmueble p) {
        return repositorio.save(p);
    }

    @Override   
    public TipoInmueble delete(int id) {
        TipoInmueble p = repositorio.findById(id);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
}
