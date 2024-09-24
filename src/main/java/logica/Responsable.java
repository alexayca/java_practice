/*
 * 
 */
package logica;

import java.util.Date;

/**
 *
 * @author alexa
 */
public class Responsable extends Persona {
    private int id_responsable;
    private String tipo_relacion;

    public Responsable() {
    }

    public Responsable(int id_responsable, String tipo_relacion, String DNI, Date fecha_nacimiento, String nombre, String apellido, String direccion, String telefono) {
        super(DNI, fecha_nacimiento, nombre, apellido, direccion, telefono);
        this.id_responsable = id_responsable;
        this.tipo_relacion = tipo_relacion;
    }

    public String getTipo_relacion() {
        return tipo_relacion;
    }

    public void setTipo_relacion(String tipo_relacion) {
        this.tipo_relacion = tipo_relacion;
    }

    public int getId_responsable() {
        return id_responsable;
    }

    public void setId_responsable(int id_responsable) {
        this.id_responsable = id_responsable;
    }
    
    
}
