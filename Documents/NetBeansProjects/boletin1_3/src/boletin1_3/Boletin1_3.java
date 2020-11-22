
package boletin1_3;
import java.util.Scanner;
public class Boletin1_3 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantos euros queres pasar a dolares?");
       float euros = sc.nextFloat();
        Scanner sca = new Scanner(System.in);
        System.out.println("Canto e o cambio?");
        float eurosadolar = sca.nextFloat();
        System.out.println("Son "+ euros*eurosadolar +"dolares");
    }
    
}
