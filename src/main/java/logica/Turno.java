/*
 * 
 */
package logica;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author alexa
 */
@Entity
public class Turno {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_turno;
    
    @Temporal(TemporalType.DATE)
    private Date fecha_turno;
    
    private String hora_turno;
    private String padecimiento;
    
    @ManyToOne
    @JoinColumn(name="id_turno")
    private Odontologo odonto;  // relacion n:1 mediante un objeto

    @ManyToOne
    @JoinColumn(name="id_turno2")
    private Paciente pacien;
    
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
