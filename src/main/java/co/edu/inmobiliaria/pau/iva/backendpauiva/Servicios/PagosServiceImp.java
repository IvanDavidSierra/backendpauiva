/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Pagos;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Infraestructura.PagosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagosServiceImp implements PagosService{
    @Autowired
    private PagosRepository repositorio;
    
    @Override
    public List<Pagos> listar(){
        return repositorio.findAll();
    }

    @Override
    public Pagos listarId(int id) {
        return repositorio.findById(id);
    }
    
    @Override
    public Pagos add(Pagos p) {
        return repositorio.save(p);
    }

    @Override    
    public Pagos edit(Pagos p) {
        return repositorio.save(p);
    }

    @Override   
    public Pagos delete(int id) {
        Pagos p = repositorio.findById(id);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
}
