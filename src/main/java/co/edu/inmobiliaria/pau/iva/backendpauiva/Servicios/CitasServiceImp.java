package co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Citas;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Infraestructura.CitasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitasServiceImp implements CitasService {
    @Autowired
    private CitasRepository repositorio;
    
    @Override
    public List<Citas> listar(){
        return repositorio.findAll();
    }

    @Override
    public Citas listarId(int id) {
        return repositorio.findById(id);
    }
    
    @Override
    public Citas add(Citas p) {
        return repositorio.save(p);
    }

    @Override    
    public Citas edit(Citas p) {
        return repositorio.save(p);
    }

    @Override   
    public Citas delete(int id) {
        Citas p = repositorio.findById(id);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
}
