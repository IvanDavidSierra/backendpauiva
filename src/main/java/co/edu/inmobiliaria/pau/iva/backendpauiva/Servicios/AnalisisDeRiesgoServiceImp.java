/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.AnalisisDeRiesgo;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Infraestructura.AnalisisDeRiesgoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnalisisDeRiesgoServiceImp implements AnalisisDeRiesgoService{
        @Autowired
    private AnalisisDeRiesgoRepository repositorio;
    
    @Override
    public List<AnalisisDeRiesgo> listar(){
        return repositorio.findAll();
    }

    @Override
    public AnalisisDeRiesgo listarId(int id) {
        return repositorio.findById(id);
    }
    
    @Override
    public AnalisisDeRiesgo add(AnalisisDeRiesgo p) {
        return repositorio.save(p);
    }

    @Override    
    public AnalisisDeRiesgo edit(AnalisisDeRiesgo p) {
        return repositorio.save(p);
    }

    @Override   
    public AnalisisDeRiesgo delete(int id) {
        AnalisisDeRiesgo p = repositorio.findById(id);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
}
