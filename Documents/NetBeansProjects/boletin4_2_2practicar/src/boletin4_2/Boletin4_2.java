
package boletin4_2;

import java.util.Scanner;
public class Boletin4_2 {

  
    public static void main(String[] args) {
   
        Satelite p1 = new Satelite();
        p1.verPosicion();
        Satelite satelite = new Satelite(21,22,2000);
         System.out.println("O satelite atopase no paralelo"+satelite.getParalelo()+"meridiano"+satelite.getMeridiano()+"a unha distancia da terra"+satelite.getDistanciaTerra());
        Scanner sc = new Scanner (System.in);
        double paralelo = sc.nextDouble();
        System.out.println("paralelo es = ");
        double meridiano = sc.nextDouble();
        System.out.println("meridiano es = ");
        double distanciaTerra = sc.nextDouble();
        Satelite s3 = new Satelite ();
        s3.verPosicion();
        
        
       
       
       
           
       }     
}
