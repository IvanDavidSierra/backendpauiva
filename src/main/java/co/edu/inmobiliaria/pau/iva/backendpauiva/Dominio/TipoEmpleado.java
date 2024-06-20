package co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio;

import jakarta.persistence.*;
@Entity
@Table(name = "tipoempleado")
public class TipoEmpleado {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idtipoempleado;
    
    @Column
    private String descripcion; 

    public int getIdtipoempleado() {
        return idtipoempleado;
    }

    public void setIdtipoempleado(int idtipoempleado) {
        this.idtipoempleado = idtipoempleado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
