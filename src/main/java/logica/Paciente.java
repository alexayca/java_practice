/*
 * 
 */
package logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author alexa
 */
@Entity
public class Paciente extends Persona implements Serializable{
    
    private boolean seguro_social;
    private String tipo_sangre;
    
    @OneToOne
    private Responsable responsable; // Relacion 1:1
    
    @OneToMany(mappedBy = "pacien")
    private List<Turno> listaTurnos;    // Relacion 1:n

    
    public Paciente() {
    }

    public Paciente( boolean seguro_social, String tipo_sangre, Responsable responsable, List<Turno> listaTurnos, int id, String DNI, Date fecha_nacimiento, String nombre, String apellido, String direccion, String telefono) {
        super(id, DNI, fecha_nacimiento, nombre, apellido, direccion, telefono);
        this.seguro_social = seguro_social;
        this.tipo_sangre = tipo_sangre;
        this.responsable = responsable;
        this.listaTurnos = listaTurnos;
    }
    
    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }

    public boolean isSeguro_social() {
        return seguro_social;
    }

    public void setSeguro_social(boolean seguro_social) {
        this.seguro_social = seguro_social;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }
    
    
}
