/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.inmobiliaria.pau.iva.backendpauiva.Controladores;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Inmueble;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios.InmuebleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/inmueble"})
public class InmuebleControlador {
        @Autowired
    InmuebleService service;
    
    @GetMapping("/submit")
    public List<Inmueble> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public Inmueble agregar(@RequestBody Inmueble p){
        return service.add(p);
    }
    
    @GetMapping("/submit/{id}")
    public Inmueble listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }
    
    @PutMapping("/submit/{id}")
    public Inmueble  editar(@RequestBody Inmueble p, @PathVariable("id") int id){
        p.setIdinmueble(id);
        return service.edit(p);
    }
    @DeleteMapping("/submit/{id}") 
    public Inmueble delete(@PathVariable("id") int id){
        return service.delete(id);
    }
}
