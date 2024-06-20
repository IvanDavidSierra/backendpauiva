
package co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Inmueble;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Infraestructura.InmuebleRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InmuebleServiceImp implements InmuebleService {
    @Autowired
    private InmuebleRepository repositorio;
    
    @Override
    public List<Inmueble> listar(){
        return repositorio.findAll();
    }

    @Override
    public Inmueble listarId(int id) {
        return repositorio.findById(id);
    }
    
    @Override
    public Inmueble add(Inmueble p) {
        return repositorio.save(p);
    }

    @Override    
    public Inmueble edit(Inmueble p) {
        return repositorio.save(p);
    }

    @Override   
    public Inmueble delete(int id) {
        Inmueble p = repositorio.findById(id);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }   
}
