package co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio;
import jakarta.persistence.*;
@Entity
@Table(name = "inmueble")
public class Inmueble {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idinmueble;
    @Column
    private int tipoinmueble;
    @Column
    private String direccion;
    @Column
    private String descripcion;
    @Column
    private int propietario;
    @Column
    private String foto;
    @Column
    private int pago;
    @Column
    private int comercial;

    public int getIdinmueble() {
        return idinmueble;
    }

    public void setIdinmueble(int idinmueble) {
        this.idinmueble = idinmueble;
    }

    public int getTipoinmueble() {
        return tipoinmueble;
    }

    public void setTipoinmueble(int tipoinmueble) {
        this.tipoinmueble = tipoinmueble;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPropietario() {
        return propietario;
    }

    public void setPropietario(int propietario) {
        this.propietario = propietario;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getPago() {
        return pago;
    }

    public void setPago(int pago) {
        this.pago = pago;
    }

    public int getComercial() {
        return comercial;
    }

    public void setComercial(int comercial) {
        this.comercial = comercial;
    }
    

   
}
