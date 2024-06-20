package co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.TipoCliente;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Infraestructura.TipoClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoClienteServiceImp implements TipoClienteService{
    @Autowired
    private TipoClienteRepository repositorio;
    
    @Override
    public List<TipoCliente> listar(){
        return repositorio.findAll();
    }

    @Override
    public TipoCliente listarId(int id) {
        return repositorio.findById(id);
    }
    
    @Override
    public TipoCliente add(TipoCliente p) {
        return repositorio.save(p);
    }

    @Override    
    public TipoCliente edit(TipoCliente p) {
        return repositorio.save(p);
    }

    @Override   
    public TipoCliente delete(int id) {
        TipoCliente p = repositorio.findById(id);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
    
}


