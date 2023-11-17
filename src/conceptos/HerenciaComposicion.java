/**
 * Corregido de:
 * https://www.arquitecturajava.com/java-strategy-pattern-herencia-vs-composicion/
 *
 * definir la misma funcionalidad del IVA a través de delegación.
 *
 * */

package conceptos;

public class HerenciaComposicion {
    public static void main(String[] args) {

        /* - Compras - */
        Compra c= new Compra("1A","procesador",200, new IVA());
        System.out.println("\nCompras\nIVA\t\t\t " + c.getImporteConIVA());

        Compra c2= new Compra("1A","procesador",200, new IVAReducido());
        System.out.println("IVA reducido " + c2.getImporteConIVA());

        Compra c3= new Compra("1A","procesador",200, new SinIVA());
        System.out.println("Sin IVA\t\t " + c3.getImporteConIVA());



        /* - Facturas - */
        Factura f= new Factura(1,"Pedido 1",500,"Isabel", new IVA());
        System.out.println("\nFacturas\nIVA\t\t\t " + f.getImporteConIVA());

        Factura f2= new Factura(1,"Pedido 1",500,"Isabel", new IVAReducido());
        System.out.println("IVA reducido " + f2.getImporteConIVA());

        Factura f3= new Factura(1,"Pedido 1",500,"Isabel", new SinIVA());
        System.out.println("Sin IVA\t\t " + f3.getImporteConIVA());
    }
}


/** --------------------
 * La clase Compra esta compuesta por IVA
 * */
class Compra {

    private String id;
    private String concepto;
    private double importe;
    private IVA tipo;


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getConcepto() {
        return concepto;
    }
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
    public double getImporte() {
        return importe;
    }
    public void setImporte(double importe) {
        this.importe = importe;
    }
    public Compra(String id, String concepto, double importe,IVA tipo) {
        this.id = id;
        this.concepto = concepto;
        this.importe = importe;
        this.tipo=tipo;
    }

    public double getImporteConIVA() {
        return tipo.getImporteConIVA(this.getImporte());
    }

}


/** --------------------
 * La clase Factura esta compuesta por IVA
 * */
class Factura {
    private int numero;
    private String concepto;
    private double importe;
    private String cliente;
    private IVA tipo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Factura(int numero, String concepto, double importe, String cliente, IVA tipo) {
        this.numero = numero;
        this.concepto = concepto;
        this.importe = importe;
        this.cliente = cliente;
        this.tipo=tipo;
    }

    public double getImporteConIVA() {
        return tipo.getImporteConIVA(this.getImporte());
    }

}


/** --------------------
 * Se puede usar directamente la interfaz Impuesto como tipo de referencia.
 * Usando una expresión lambda que implementa el método getImporteConIVA de la interfaz Impuesto.
 *
 */
@FunctionalInterface
interface Impuesto {
    double IVA = 1.16;
    public double getImporteConIVA(double importeSinIVA );
}


/** --------------------
 * La clase IVA, no es necesario implementar la interfaz Impuesto,
 * ya que está extendiendo en las clases IVAReducido y SinIVA.
 * Se podría eliminar la clase IVA y
 * definir directamente las clases IVAReducido y SinIVA
 * como implementaciones de la interfaz Impuesto.
 * Pero para propositos del concepto de herencia y composicion se utiliza.
 * */
class IVA implements Impuesto{
    public double getImporteConIVA(double importe) {
        return Math.round(importe *IVA);
    }
}


/** -------------------- */
class IVAReducido extends IVA implements Impuesto{
    @Override
    public double getImporteConIVA(double importe) {
        return Math.round(importe*(IVA-0.06));
    }
}


/** -------------------- */
class SinIVA extends IVA implements Impuesto{
    @Override
    public double getImporteConIVA(double importe) {
        return importe;
    }
}


/** -------------------- */

