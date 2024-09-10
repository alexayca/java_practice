/*
 * 
 */
package logica;

import java.util.List;

/**
 *
 * @author alexa
 */
public class Cliente {
    
    private int id;
    private String dni;
    private String nombre;
    private String apellido;
    private List<Boleto> listaBoletos;  // collection de boletos

    public Cliente(int id, String dni, String nombre, String apellido, List<Boleto> listaBoletos) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.listaBoletos = listaBoletos;
    }



    public Cliente() {
    }

    public List<Boleto> getListaBoletos() {
        return listaBoletos;
    }

    public void setListaBoletos(List<Boleto> listaBoletos) {
        this.listaBoletos = listaBoletos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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
    
    
    
}
