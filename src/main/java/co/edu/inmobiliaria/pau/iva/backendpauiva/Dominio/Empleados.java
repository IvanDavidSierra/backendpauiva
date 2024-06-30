package co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio;
import jakarta.persistence.*;
@Entity
@Table(name = "empleados")
public class Empleados {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idempleado;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @ManyToOne
    @JoinColumn(name = "tipoempleado", referencedColumnName = "idtipoempleado")
    private TipoEmpleado tipoempleado;
    @Column
    private int oficina;
    @Column
    private String correo; 

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
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

    public TipoEmpleado getTipoEmpleado() {
        return tipoempleado;
    }

    public void setTipoEmpleado(TipoEmpleado tipoempleado) {
        this.tipoempleado = tipoempleado;
    }
    public int getOficina() {
        return oficina;
    }

    public void setOficina(int oficina) {
        this.oficina = oficina;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
