package co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Citas;
import java.util.List;

public interface CitasService {
    List<Citas> listar();
    Citas listarId(int id);
    Citas add(Citas p);
    Citas edit(Citas p);
    Citas delete(int id);    
}
