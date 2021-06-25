package paqueteDeEjercicio;

import java.util.Scanner;
public class cajascobranza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int cantidadFacturaCajas[] = new int[4];
           double promedio = 0;
           int totalactura=0;
        
           System.out.println("SISTEMA DE CAJAS");

           System.out.println();

           System.out.println("ingrese el importe de la factura  (0=terminar)");
           Scanner sc = new Scanner(System.in);
           double importe = sc.nextDouble();
           while(importe !=0) {
        	   System.out.println("ingrese la caja donde pago(1 a4)");
               int posicionCajas=sc.nextInt();
               cantidadFacturaCajas[posicionCajas -1 ]++;
               totalactura++;
               
               //promedio = promedio + importe;
               promedio += importe;
                sc = new Scanner(System.in);
               System.out.println("ingrese importe de factura(0=terminar)");
               importe = sc.nextDouble();
               
           }
           for(int i = 0;i< cantidadFacturaCajas.length; i++) {
        	   System.out.println("cajas:" +(i+1) + "-->"+ cantidadFacturaCajas[i]);
           }
           System.out.println("promedio:"+(promedio /totalactura));
	}

}
