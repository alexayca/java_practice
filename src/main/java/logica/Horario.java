/*
 * 
 */
package logica;

/**
 *
 * @author alexa
 */
public class Horario {
    private int id_horario;
    private String horario_inicio;
    private String horario_fin;

    public Horario() {
    }

    public Horario(int id_horario, String horario_inicio, String horario_fin) {
        this.id_horario = id_horario;
        this.horario_inicio = horario_inicio;
        this.horario_fin = horario_fin;
    }

    public String getHorario_fin() {
        return horario_fin;
    }

    public void setHorario_fin(String horario_fin) {
        this.horario_fin = horario_fin;
    }

    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public String getHorario_inicio() {
        return horario_inicio;
    }

    public void setHorario_inicio(String horario_inicio) {
        this.horario_inicio = horario_inicio;
    }
    
    
}
