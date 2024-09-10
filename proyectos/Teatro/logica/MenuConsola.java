/*
 * Menu de consola con clase generica
 */
package logica;

import java.util.Scanner;

/**
 *
 * @author alexa
 * @param <T>
 */
public class MenuConsola<T extends IMenuOptions>{
    T t;
    
    private static final String op4 = "\n\t 9 Salir";
    
    static Scanner keyBoard = new Scanner(System.in);
    
    Taquilla taquilla = new Taquilla(true);
    
    public MenuConsola(T t){
        this.t=t;
    }
    
    public void seleccionarOpciones() {
		int selectedOption = 0;
                int fila=-1;
                int asiento=-1;
                boolean flag = false;
		
		do {
			
			System.out.println(t.getOp1() + t.getOp2() + t.getOp3() + op4);
			selectedOption = keyBoard.nextInt();
			
			switch (selectedOption) {
			    case 1:
				System.out.println(t.getOp1());

                                do {                                
                                    System.out.println("Dime la fila: ");
                                    fila = keyBoard.nextInt();
                                    System.out.println("Dime el asiento: ");
                                    asiento = keyBoard.nextInt();
                                    flag = t.asignarAsiento(fila,asiento );     
                                } while (!flag);
				break;
	
			    case 2:
				System.out.println(t.getOp2());
                                System.out.println("To be done");
				break;
			
			    case 3:
				System.out.println(t.getOp3());
                                t.mostrarSala();
				break;
                            
                            case 4:
				System.out.println("Una base de datos lógica");
                                taquilla.sumarPrecios();    // 1200
				break;
                                
                            case 5:
				System.out.print("\nMostrar datos de fila.\n Indique el numero de fila: ");
                                fila = keyBoard.nextInt();
                                taquilla.mostrarFila(fila);
				break;
                                
                            case 6:
				System.out.print("\n Prueba cliente ");
                                Cliente cliente =new Cliente();
                                cliente.setApellido("apellido");
                                cliente.setNombre("nombres");
                                Boleto ticket4 = new Boleto(1,7);
                                cliente.getListaBoletos().add(ticket4);
				break;
			
			    case 9:
				System.out.println("Bye");
				break;
				
			    default:
				System.out.println(IMenuOptions.opInvalida);
				break;
			} // end switch1
			
		}while(selectedOption != 9);
		
		keyBoard.close();
	} // END seleccionarOpciones()
    
}
