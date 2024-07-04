package co.edu.inmobiliaria.pau.iva.backendpauiva.Infraestructura;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Clientes;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository<Clientes, Integer> {
    List<Clientes> findAll();
    Clientes findByCorreo(String correo);
    Clientes findById(int idcliente);
    Clientes save(Clientes p);
    void delete(Clientes p);
}
