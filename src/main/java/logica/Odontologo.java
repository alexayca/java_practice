/*
 * 
 */
package logica;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;

/**
 *
 * @author alexa
 */
@Entity
public class Odontologo extends Persona{
    //private int id_odontologo;
    private String especialidad;
    // Relacion 1:n (bidireccional "nombre de la relacion" en este caso la clase Turno mediante collection)
    @javax.persistence.OneToMany(mappedBy = "odonto")
    private List<Turno> listaTurnos;
    @javax.persistence.OneToOne
    private Usuario usuario;    // 1:1
    @javax.persistence.OneToOne
    private Horario horario;    // 1:1

    public Odontologo() {

    }

    public Odontologo(String especialidad, List<Turno> listaTurnos, Usuario usuario, Horario horario, String DNI, Date fecha_nacimiento, String nombre, String apellido, String direccion, String telefono) {
        super(DNI, fecha_nacimiento, nombre, apellido, direccion, telefono);
        
        this.especialidad = especialidad;
        this.listaTurnos = listaTurnos;
        this.usuario = usuario;
        this.horario = horario;
    }

/*    public int getId_odontologo() {
        return id_odontologo;
    }

    public void setId_odontologo(int id_odontologo) {
        this.id_odontologo = id_odontologo;
    }
*/
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
    
    
    
    
}
