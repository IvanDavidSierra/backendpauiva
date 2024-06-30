package co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio;
import jakarta.persistence.*;
@Entity
@Table(name = "tipoinmueble")
public class TipoInmueble {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idtipoinmueble;
    
    @Column
    private String descripcioninmueble;   
    

    public int getIdtipoinmueble() {
        return idtipoinmueble;
    }

    public void setIdtipoinmueble(int idtipoinmueble) {
        this.idtipoinmueble = idtipoinmueble;
    }

    public String getDescripcioninmueble() {
        return descripcioninmueble;
    }

    public void setDescripcioninmueble(String descripcioninmueble) {
        this.descripcioninmueble = descripcioninmueble;
    }

    
}
