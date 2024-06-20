/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Sucursales;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Infraestructura.SucursalesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SucursalesServiceImp implements SucursalesService {
    @Autowired
    private SucursalesRepository repositorio;
    
    @Override
    public List<Sucursales> listar(){
        return repositorio.findAll();
    }

    @Override
    public Sucursales listarId(int id) {
        return repositorio.findById(id);
    }
    
    @Override
    public Sucursales add(Sucursales p) {
        return repositorio.save(p);
    }

    @Override    
    public Sucursales edit(Sucursales p) {
        return repositorio.save(p);
    }

    @Override   
    public Sucursales delete(int id) {
        Sucursales p = repositorio.findById(id);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
}
