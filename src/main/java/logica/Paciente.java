/*
 * 
 */
package logica;

import java.util.Date;
import java.util.List;

/**
 *
 * @author alexa
 */
public class Paciente extends Persona{
    
    private int id_paciente;
    private boolean seguro_social;
    private String tipo_sangre;
    private Responsable responsable; // Relacion 1:1
    private List<Turno> listaTurnos;    // Relacion 1:n

    public Paciente() {
    }

    public Paciente(int id_paciente, boolean seguro_social, String tipo_sangre, Responsable responsable, List<Turno> listaTurnos, String DNI, Date fecha_nacimiento, String nombre, String apellido, String direccion, String telefono) {
        super(DNI, fecha_nacimiento, nombre, apellido, direccion, telefono);
        this.id_paciente = id_paciente;
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

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
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
