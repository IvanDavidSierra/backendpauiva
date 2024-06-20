package co.edu.inmobiliaria.pau.iva.backendpauiva.Infraestructura;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.AnalisisDeRiesgo;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface AnalisisDeRiesgoRepository extends Repository<AnalisisDeRiesgo, Integer>{
    List<AnalisisDeRiesgo> findAll();
    AnalisisDeRiesgo findById(int id);
    AnalisisDeRiesgo save(AnalisisDeRiesgo p);
    void delete(AnalisisDeRiesgo p);
}
