package co.edu.inmobiliaria.pau.iva.backendpauiva.Infraestructura;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Clientes;
import org.springframework.data.repository.Repository;

public interface ClientesRepository extends Repository<Clientes, Integer> {
    Clientes findByCorreo(String correo);
}
