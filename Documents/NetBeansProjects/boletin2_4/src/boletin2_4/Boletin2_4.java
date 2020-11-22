
package boletin2_4;
import java.util.Scanner;

public class Boletin2_4 {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
      System.out.println("Cantos euros tes?");
      int euros=sc.nextInt();
      int billetes100= euros/100;
      int billetes20= euros%100/20;
      int billetes5= euros%100%20/5;
      int monedas1= euros%100%20%5;
          System.out.println("Son "+billetes100+" billetes de 100, "+billetes20+" billetes de 20, "+billetes5+" billetes de 5 "+monedas1+" y monedas de 1");
    }
    
}
