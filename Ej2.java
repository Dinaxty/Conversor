
package ej2;

import java.util.Scanner;


public class Ej2 {
    
     Scanner lector = new Scanner (System.in);

public void conversor() {

    float Pesetas, cPesetas;
    final float cEuros;
    cEuros = (float) 0.01;
    System.out.println("Ingrese la cantidad de Pesetas a convertir");
    cPesetas=lector.nextFloat();
    
    Pesetas=cPesetas*cEuros;
    
    System.out.println("Pesetas equivalen a "+Pesetas+" Euros.");
}
    public static void main(String[] args) {
       
           //prueba de cambio
    	 System.out.println("EDE"); 
    	//Iniciar el codigo 
            Ej2 solucion;
            solucion=new Ej2();
          
            solucion.conversor();
    }
    
}
