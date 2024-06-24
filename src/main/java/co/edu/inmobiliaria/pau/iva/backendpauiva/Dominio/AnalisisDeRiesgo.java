package co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio;
import jakarta.persistence.*;
@Entity
@Table(name = "analisisderiesgo")
public class AnalisisDeRiesgo {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idanalisis;
    
    @Column
    private String listaclinton;
    @Column
    private String centralesriesgo;
    @Column
    private String certificado;
    @Column
    private int inmueble;
    @Column
    private String pago;

    public int getIdanalisis() {
        return idanalisis;
    }

    public void setIdanalisis(int idanalisis) {
        this.idanalisis = idanalisis;
    }

    public String getListaclinton() {
        return listaclinton;
    }

    public void setListaclinton(String listaclinton) {
        this.listaclinton = listaclinton;
    }

    public String getCentralesriesgo() {
        return centralesriesgo;
    }

    public void setCentralesriesgo(String centralesriesgo) {
        this.centralesriesgo = centralesriesgo;
    }

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

    public int getInmueble() {
        return inmueble;
    }

    public void setInmueble(int inmueble) {
        this.inmueble = inmueble;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    
}
