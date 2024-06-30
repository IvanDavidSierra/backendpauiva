package co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio;
import jakarta.persistence.*;
@Entity
@Table(name = "inmueble")
public class Inmueble {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idinmueble;
    @ManyToOne
    @JoinColumn(name = "tipoinmueble", referencedColumnName = "idtipoinmueble")
    private TipoInmueble tipoinmueble;
    @Column
    private String tituloinmueble;
    @Column
    private String estado;
    @Column
    private String direccion;
    @Column
    private String descripcion;
    @Column
    private int habitaciones;
    @Column
    private int banos;
    @Column
    private int garajes;
    @Column
    private int estrato;
    @Column
    private String area;
    @ManyToOne
    @JoinColumn(name = "propietario", referencedColumnName = "idcliente")
    private Clientes propietario;
    @Column
    private String foto;
    @ManyToOne
    @JoinColumn(name = "pago", referencedColumnName = "idpagos")
    private Pagos pago;
    @ManyToOne
    @JoinColumn(name = "comercial", referencedColumnName = "idempleado")
    private Empleados comercial;
    private String valor;


    public int getIdinmueble() {
        return idinmueble;
    }

    public void setIdinmueble(int idinmueble) {
        this.idinmueble = idinmueble;
    }

    public TipoInmueble getTipoinmueble() {
        return tipoinmueble;
    }

    public void setTipoinmueble(TipoInmueble tipoinmueble) {
        this.tipoinmueble = tipoinmueble;
    }

    public String getTituloinmueble() {
        return tituloinmueble;
    }

    public void setTituloinmueble(String tituloinmueble) {
        this.tituloinmueble = tituloinmueble;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getBanos() {
        return banos;
    }

    public void setBanos(int banos) {
        this.banos = banos;
    }

    public int getGarajes() {
        return garajes;
    }

    public void setGarajes(int garajes) {
        this.garajes = garajes;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Clientes getPropietario() {
        return propietario;
    }

    public void setPropietario(Clientes propietario) {
        this.propietario = propietario;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Pagos getPago() {
        return pago;
    }

    public void setPago(Pagos pago) {
        this.pago = pago;
    }

    public Empleados getComercial() {
        return comercial;
    }

    public void setComercial(Empleados comercial) {
        this.comercial = comercial;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }



}
