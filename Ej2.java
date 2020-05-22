
package ej2;

import java.util.Scanner;


public class Ej2 {
    
     Scanner lector = new Scanner (System.in);

public Ej2() {

    float Pesetas, cPesetas;
    final float cEuros;
    cEuros = (float) 0.01;
    System.out.println("Ingrese la cantidad de Pesetas a convertir");
    cPesetas=lector.nextFloat();
    
    Pesetas=cPesetas*cEuros;
    
    System.out.println("Pesetas equivalen a "+Pesetas+" Euros.");
}
    public static void main(String[] args) {
       
            Ej2 solucion = new Ej2();


    }
    
}
