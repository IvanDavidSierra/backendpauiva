package co.edu.inmobiliaria.pau.iva.backendpauiva.Infraestructura;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Sucursales;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface SucursalesRepository extends Repository<Sucursales, Integer> {
    List<Sucursales> findAll();
    Sucursales findById(int id);
    Sucursales save(Sucursales p);
    void delete(Sucursales p);
}
