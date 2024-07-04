package co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio;
import jakarta.persistence.*;
@Entity
@Table(name = "tipocliente")
public class TipoCliente {  
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idtipocliente;
    
    @Column
    private String descripcion;

    public int getIdtipocliente() {
        return idtipocliente;
    }

    public void setIdtipocliente(int idtipocliente) {
        this.idtipocliente = idtipocliente;
    }

    public String getDescripciontipo() {
        return descripcion;
    }

    public void setDescripciontipo(String descripciontipo) {
        this.descripcion = descripciontipo;
    }

}