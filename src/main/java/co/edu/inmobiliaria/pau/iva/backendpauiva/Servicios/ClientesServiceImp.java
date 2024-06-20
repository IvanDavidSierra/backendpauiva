
package co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Clientes;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Infraestructura.ClientesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesServiceImp implements ClientesService{
    @Autowired
    private ClientesRepository repositorio;
    
    @Override
    public List<Clientes> listar(){
        return repositorio.findAll();
    }

    @Override
    public Clientes listarId(int id) {
        return repositorio.findById(id);
    }
    
    @Override
    public Clientes add(Clientes p) {
        return repositorio.save(p);
    }

    @Override    
    public Clientes edit(Clientes p) {
        return repositorio.save(p);
    }

    @Override   
    public Clientes delete(int id) {
        Clientes p = repositorio.findById(id);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
}
