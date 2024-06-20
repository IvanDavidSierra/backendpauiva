/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Avaluo;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Infraestructura.AvaluoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AvaluoServiceImp implements AvaluoService{
    @Autowired
    private AvaluoRepository repositorio;
    
    @Override
    public List<Avaluo> listar(){
        return repositorio.findAll();
    }

    @Override
    public Avaluo listarId(int id) {
        return repositorio.findById(id);
    }
    
    @Override
    public Avaluo add(Avaluo p) {
        return repositorio.save(p);
    }

    @Override    
    public Avaluo edit(Avaluo p) {
        return repositorio.save(p);
    }

    @Override   
    public Avaluo delete(int id) {
        Avaluo p = repositorio.findById(id);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
}
