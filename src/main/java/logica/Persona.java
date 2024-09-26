/*
 * 
 */
package logica;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author alexa
 * 
 * no persiste como tabla pero exista como plantilla para las clases hijas
 * creando una tabla por clase hija, con este mapeo el ID debe estar en la clase padre
 * annotations JPA
 * Project Lombok permite agregar varias funcionalidades con anotaciones (no implementado)
 */
@Entity 
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Persona {

    // tiene ID autogenerado desde la clase padre que hereda a clase hijas
    // usando la misma estrategia de generación
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String DNI;
    
    // debemos mapear el tipo Data indicando la temporalidad
    @Temporal(TemporalType.DATE)
    
    private Date fecha_nacimiento;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;

    
    public Persona() {
    }

    public Persona( String DNI, Date fecha_nacimiento, String nombre, String apellido, String direccion, String telefono) {
        this.DNI = DNI;
        this.fecha_nacimiento = fecha_nacimiento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
