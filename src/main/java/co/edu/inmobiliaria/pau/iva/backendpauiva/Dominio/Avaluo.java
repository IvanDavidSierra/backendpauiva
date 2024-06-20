package co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio;
import jakarta.persistence.*;
@Entity
@Table(name = "avaluo")
public class Avaluo {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idavaluo;
    
    @Column
    private String fecha;

    @Column
    private int valor;
    
    @Column
    private String descripcion;
    
    @Column
    private int inmueble;
    
    @Column
    private int cliente;

    public int getIdavaluo() {
        return idavaluo;
    }

    public void setIdavaluo(int idavaluo) {
        this.idavaluo = idavaluo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getInmueble() {
        return inmueble;
    }

    public void setInmueble(int inmueble) {
        this.inmueble = inmueble;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }
 
}
