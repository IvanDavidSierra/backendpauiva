package co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio;
import jakarta.persistence.*;
@Entity
@Table(name = "tipopagos")
public class TipoPagos {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idtipos;
    
    @Column
    private String tipopago;

    public int getIdtipos() {
        return idtipos;
    }

    public void setIdtipos(int idtipos) {
        this.idtipos = idtipos;
    }

    public String getTipopago() {
        return tipopago;
    }

    public void setTipopago(String tipopago) {
        this.tipopago = tipopago;
    }
    
}
