package co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio;
import jakarta.persistence.*;
@Entity
@Table(name = "clientes")
public class Clientes {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idcliente;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @ManyToOne
    @JoinColumn(name = "tipocliente", referencedColumnName = "idtipocliente")
    private TipoCliente tipoCliente;
    @Column
    private Long telefono;
    @Column
    private String correo;
    @Column
    private String razon_social;
    @Column 
    private String nit;

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }


    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

}
