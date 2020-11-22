
package boletin4_1;
import java.util.Scanner;
public class Boletin4_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
    coche p1 = new coche();
    System.out.println("Cuanto ha acelerado");
    int v=sc.nextInt();
    p1.setAcelerar(v);
    System.out.println("Cuanto ha frenado");
    int a=sc.nextInt();
    p1.setFrenar(a);
    System.out.println(p1.getVelocidade());
   
        
        
}    
}
