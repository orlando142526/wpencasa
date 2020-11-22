
package boletin9.pkg2;
import java.util.Scanner;

public class Calcular {
      private int cont;
    private int suma;
    private double producto = 1;
    Scanner sc = new Scanner(System.in);
    
    public void CalcularSumProd(){
    for (cont=10;cont<=90;cont++){
        suma = suma + cont;
        producto = producto * cont;
    }
        System.out.println("\nSuma = "+suma+"\nProducto = "+producto);  
    }
}
