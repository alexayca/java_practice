/*
 * 10 filas de 10 asientos
 * L libre
 * X ocupado
 */
package logica;


/**
 *
 * @author alexa
 */
public class Sala implements IMenuOptions{
    
    private static String op1 = "\n\t 1 Reservar asiento";
    private static String op2 = "\n\t 2 Cancelar asiento";
    private static String op3 = "\n\t 3 Visualizar asientos";

    private char[][] asientos = new char[10][10];
        
    @Override
    public String getOp1() {
        return op1;
    }

    @Override
    public String getOp2() {
        return op2;
    }

    @Override
    public String getOp3() {
        return op3;
    }
    

    public Sala() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                asientos[i][j]='L';
            }
        }
    }
    
    // setter
    // @
    @Override
    public boolean asignarAsiento(int fila, int asiento){
        fila = fila-1;
        asiento = asiento-1;
        if (asientos[fila][asiento] == 'L') {
            asientos[fila][asiento] = 'X';
            System.out.println("Asiento: " + (asiento+1) +" en fila " + (fila+1) +" asignado");
            return true;
        }else{
            System.out.println("El asiento ya esta ocupado");
            return false;
        }
        
    }

    @Override
    public void mostrarSala(){
        for(char[] fila:asientos){
            for(char butaca:fila){
                System.out.print(butaca + " ");
            }
            System.out.println();
        }
    }

    
}
