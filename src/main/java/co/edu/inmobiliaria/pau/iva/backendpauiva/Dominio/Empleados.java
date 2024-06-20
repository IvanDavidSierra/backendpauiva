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
    @Column
    private int tipoempleado;
    @Column
    private int oficina;
    @Column
    private String correo;
    @Column
    private String contraseña;    
    @Column
    private int comisiones;

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

    public int getTipoempleado() {
        return tipoempleado;
    }

    public void setTipoempleado(int tipoempleado) {
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

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getComisiones() {
        return comisiones;
    }

    public void setComisiones(int comisiones) {
        this.comisiones = comisiones;
    }
    
    
}
