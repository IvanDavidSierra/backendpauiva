package co.edu.inmobiliaria.pau.iva.backendpauiva.Infraestructura;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository<Clientes, Long> {
    Clientes findByCorreo(String correo);
}
