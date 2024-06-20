package co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.AnalisisDeRiesgo;
import java.util.List;
public interface AnalisisDeRiesgoService {
    List<AnalisisDeRiesgo> listar();
    AnalisisDeRiesgo listarId(int id);
    AnalisisDeRiesgo add(AnalisisDeRiesgo p);
    AnalisisDeRiesgo edit(AnalisisDeRiesgo p);
    AnalisisDeRiesgo delete(int id);
}
