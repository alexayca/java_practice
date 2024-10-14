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
public class Responsable extends Persona implements Serializable {

    private String tipo_relacion;

    public Responsable() {
    }

    public Responsable(String tipo_relacion, int id, String DNI, Date fecha_nacimiento, String nombre, String apellido, String direccion, String telefono) {
        super(id, DNI, fecha_nacimiento, nombre, apellido, direccion, telefono);
        this.tipo_relacion = tipo_relacion;
    }

    public String getTipo_relacion() {
        return tipo_relacion;
    }

    public void setTipo_relacion(String tipo_relacion) {
        this.tipo_relacion = tipo_relacion;
    }
    
}
