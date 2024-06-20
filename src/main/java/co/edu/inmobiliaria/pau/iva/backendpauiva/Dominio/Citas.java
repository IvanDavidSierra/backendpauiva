package co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio;
import jakarta.persistence.*;
@Entity
@Table(name = "citas")
public class Citas {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idcitas;
    
    @Column
    private String fecha;

    @Column
    private String estado;

    @Column
    private int inmueble;

    public int getIdcitas() {
        return idcitas;
    }

    public void setIdcitas(int idcitas) {
        this.idcitas = idcitas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getInmueble() {
        return inmueble;
    }

    public void setInmueble(int inmueble) {
        this.inmueble = inmueble;
    }
    
     
}
