/*
 * 
 */
package logica;

import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author alexa
 */
@Entity
public class Secretario extends Persona {
    //private int id_secretaria;
    private String sector;
    
    @javax.persistence.OneToOne
    private Usuario usuario;

    public Secretario() {
    }

    public Secretario( String sector, Usuario usuario, String DNI, Date fecha_nacimiento, String nombre, String apellido, String direccion, String telefono) {
        super(DNI, fecha_nacimiento, nombre, apellido, direccion, telefono);

        this.sector = sector;
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

/*    public int getId_secretaria() {
        return id_secretaria;
    }

    public void setId_secretaria(int id_secretaria) {
        this.id_secretaria = id_secretaria;
    }
*/
    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
    
    
}
