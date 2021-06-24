package PaqueteDeEjercicio;     
import java.util.Scanner;

public class tateti {
    private static int col = 3;
    private static int filas=3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char tablero[][] = new char [filas][col];
		  System.out.println("juego de tateti");
      System.out.println();
     
      int posicion;
      int turno= 1;
      boolean ganador = false;
      char ficha;
      char j1,j2;
     
     int contador = 0;
     
     Scanner sc = new Scanner(System.in);
     
      mostrar(tablero);
           	while( !ganador && contador <9) {
    		
    	            contador++;
    		        turno= contador %2;
         	       jugada(turno,tablero);
    		     
    		       ganador = hayganador(tablero);
    		
    		            if(ganador) {
    			                     System.out.println("GANASTE!! JUGADOR"+ (turno +1));
    		              }
   		       }
    		
    		
    	}
	
	private static boolean hayganador(char[][] tablero) {
		// TODO Auto-generated method stub
		boolean con1= tablero[0][0] == tablero[0][1] && tablero[0][0] == tablero[0][2] && (tablero[0][0] == 'X'|| tablero[0][0] == '0');
		boolean con2 = tablero[1][0] == tablero[1][1] && tablero[1][0] == tablero[1][2]  && (tablero[1][0] == 'X'|| tablero[1][0] == '0');
		boolean con3 = tablero[2][0] == tablero[2][1] && tablero[2][0] == tablero[2][2]  && (tablero[2][0] == 'X'|| tablero[2][0] == '0');
		
		boolean con4 = tablero[0][0] == tablero[1][0] && tablero[0][0] == tablero[2][0]  && (tablero[0][0] == 'X'|| tablero[0][0] == '0'); 
		boolean con5 = tablero[0][1] == tablero[1][1] && tablero[0][1] == tablero[2][1]  && (tablero[0][1] == 'X'|| tablero[0][1] == '0'); 
		boolean con6 = tablero[0][2] == tablero[1][2] && tablero[0][2] == tablero[2][2]  && (tablero[0][2] == 'X'|| tablero[0][2] == '0'); 
		boolean con7 = tablero[0][0] == tablero[1][1] && tablero[0][0] == tablero[2][2]  && (tablero[0][0] == 'X'|| tablero[0][0] == '0'); 
		boolean con8 = tablero[0][2] == tablero[1][1] && tablero[0][2] == tablero[2][0]  && (tablero[0][2] == 'X'|| tablero[0][2] == '0');
		
		return con1 || con2 || con3 ||con4 ||con5 || con6 || con7 || con8;
				}

	private static void jugada(int turno, char[][] tablero) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ingresa la fila  ");
		int fila=sc.nextInt();
		System.out.println("ingresa la columna:  ");
		int col=sc.nextInt();
		if(tablero[fila][col]  == 'X' || tablero[fila][col] =='O') {
			
			System.out.println("no se puede jugar");
		}else {
			if(turno == 0) {
				tablero[fila][col]='X';
			}else {
				tablero[fila][col]='O';
			}
		
		}
      mostrar(tablero);
	}



 public static void mostrar(char[][] tablero) {
    	for(int fila=0;fila<tablero.length;fila++) {
    		for(int col=0;col<tablero.length;col++) {
    			
    			System.out.print(tablero[fila][col]+ " ");

    		}
    		System.out.println();

    	}
    }
    
}
