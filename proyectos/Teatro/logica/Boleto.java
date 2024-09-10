/*
 * https://projectlombok.org/#
 */
package logica;
import java.time.LocalDate;


public class Boleto {
    
    private static int numero = 0;
    private int fila;
    private int asiento;
    private LocalDate fecha_compra;
    private LocalDate fecha_evento;
    private double precio;
    private Cliente cliente;


    public Boleto(int fila, int asiento, LocalDate fecha_evento, double precio) {
        numero++;
        this.fecha_compra = LocalDate.now();
        this.fila = fila;
        this.asiento = asiento;
        this.fecha_evento = fecha_evento;
        this.precio = precio;
    }
  
    
    public Boleto(int fila, int asiento) {
        numero++;
        this.fecha_compra = LocalDate.now();
        this.fecha_evento = LocalDate.now();
        this.fila = fila;
        this.asiento = asiento;
        this.precio = 0;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public LocalDate getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(LocalDate fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public LocalDate getFecha_evento() {
        return fecha_evento;
    }

    public void setFecha_evento(LocalDate fecha_evento) {
        this.fecha_evento = fecha_evento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    @Override
    public String toString() {
        return "\n----\nBoleto " + "No." + numero 
                + "\nfila " + fila 
                + " - asiento " + asiento 
                + "\nFecha de compra: " + fecha_compra 
                + "\nFecha de evento: " + fecha_evento 
                + "\n precio $" + precio + "\n";
    }


}
