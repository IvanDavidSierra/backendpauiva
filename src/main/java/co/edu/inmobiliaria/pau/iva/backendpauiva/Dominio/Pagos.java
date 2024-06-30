package co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio;
import jakarta.persistence.*;
@Entity
@Table(name = "pagos")
public class Pagos {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idpagos;
    @Column
    private int tipopago;
    @Column
    private String consignacion;
    @Column
    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "cliente", referencedColumnName = "idcliente")
    private Clientes cliente;

    public int getIdpagos() {
        return idpagos;
    }

    public void setIdpagos(int idpagos) {
        this.idpagos = idpagos;
    }

    public int getTipopago() {
        return tipopago;
    }

    public void setTipopago(int tipopago) {
        this.tipopago = tipopago;
    }

    public String getConsignacion() {
        return consignacion;
    }

    public void setConsignacion(String consignacion) {
        this.consignacion = consignacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }


    
}
