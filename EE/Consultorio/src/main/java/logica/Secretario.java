/*
 * 
 */
package logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author alexa
 */
@Entity
public class Secretario extends Persona implements Serializable{

    private String sector;
    
    @javax.persistence.OneToOne
    private Usuario usuario;

    public Secretario() {
    }

    public Secretario( String sector, Usuario usuario, int id, String DNI, Date fecha_nacimiento, String nombre, String apellido, String direccion, String telefono) {
        super(id, DNI, fecha_nacimiento, nombre, apellido, direccion, telefono);
        this.sector = sector;
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
    
    
}
