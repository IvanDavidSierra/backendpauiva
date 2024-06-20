package co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio;
import jakarta.persistence.*;
@Entity
@Table(name = "sucursales")
public class Sucursales {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idsucursales;
    
    @Column
    private String ubicacion;

    public int getIdsucursales() {
        return idsucursales;
    }

    public void setIdsucursales(int idsucursales) {
        this.idsucursales = idsucursales;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
}
