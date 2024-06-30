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
    private String descripciontipo; 

    public int getIdtipoempleado() {
        return idtipoempleado;
    }

    public void setIdtipoempleado(int idtipoempleado) {
        this.idtipoempleado = idtipoempleado;
    }

    public String getDescripcion() {
        return descripciontipo;
    }

    public void setDescripcion(String descripciontipo) {
        this.descripciontipo = descripciontipo;
    }
    
}
