/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.TipoPagos;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Infraestructura.TipoPagosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoPagosServiceImp implements TipoPagosService {
    @Autowired
    private TipoPagosRepository repositorio;
    
    @Override
    public List<TipoPagos> listar(){
        return repositorio.findAll();
    }

    @Override
    public TipoPagos listarId(int id) {
        return repositorio.findById(id);
    }
    
    @Override
    public TipoPagos add(TipoPagos p) {
        return repositorio.save(p);
    }

    @Override    
    public TipoPagos edit(TipoPagos p) {
        return repositorio.save(p);
    }

    @Override   
    public TipoPagos delete(int id) {
        TipoPagos p = repositorio.findById(id);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
}
