package paqueteDeEjercicio;

import java.util.Scanner;

public class Ejercicio214 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int PesoPaquete, zona, costo;
        costo =0;
        Scanner Sc = new Scanner(System.in);
        System.out.println("ingrese en gramos el peso del paquete");
        PesoPaquete = Sc.nextInt();
       
        if(PesoPaquete < 5000) {
        	 System.out.println("Inglese el codigo de la zona a la que desea enviar");
             System.out.println("1- America del norte");
             System.out.println("2- America central");
             System.out.println("3-America del sur");
             System.out.println("4-Europa");
             System.out.println("5-Asia");
             zona = Sc.nextInt();
        	switch(zona) {
        	case 1:
        		costo = 11 * PesoPaquete;
        		break;
        	case 2:
        		costo = 10 * PesoPaquete;
        		break;
        	case 3:
        	   costo = 12 * PesoPaquete;
        	   break;
        	case 4:
        		costo = 24  * PesoPaquete;
        		break;
        	case 5:
        		costo = 27 * PesoPaquete;
        		break;
        		default:
        			costo =0;
        			break;
        	}
        	System.out.println("el valor es " + costo);
        } else {
        	System.out.println("el peso supera lo permitido");
	}
	}
	}

