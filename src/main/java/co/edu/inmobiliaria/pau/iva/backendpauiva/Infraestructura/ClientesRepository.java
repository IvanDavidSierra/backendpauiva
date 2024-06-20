package co.edu.inmobiliaria.pau.iva.backendpauiva.Infraestructura;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Clientes;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface ClientesRepository extends Repository<Clientes, Integer> {
    List<Clientes> findAll();
    Clientes findById(int id);
    Clientes save(Clientes p);
    void delete(Clientes p);
}
