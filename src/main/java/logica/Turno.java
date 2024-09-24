/*
 * 
 */
package logica;

import java.util.Date;

/**
 *
 * @author alexa
 */
public class Turno {
    private int id_turno;
    private Date fecha_turno;
    private String hora_turno;
    private String padecimiento;

    public Turno() {
    }

    public Turno(int id_turno, Date fecha_turno, String hora_turno, String padecimiento) {
        this.id_turno = id_turno;
        this.fecha_turno = fecha_turno;
        this.hora_turno = hora_turno;
        this.padecimiento = padecimiento;
    }

    public String getPadecimiento() {
        return padecimiento;
    }

    public void setPadecimiento(String padecimiento) {
        this.padecimiento = padecimiento;
    }

    public int getId_turno() {
        return id_turno;
    }

    public void setId_turno(int id_turno) {
        this.id_turno = id_turno;
    }

    public Date getFecha_turno() {
        return fecha_turno;
    }

    public void setFecha_turno(Date fecha_turno) {
        this.fecha_turno = fecha_turno;
    }

    public String getHora_turno() {
        return hora_turno;
    }

    public void setHora_turno(String hora_turno) {
        this.hora_turno = hora_turno;
    }
    
    
}
