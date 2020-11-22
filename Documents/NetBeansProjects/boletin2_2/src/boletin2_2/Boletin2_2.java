
package boletin2_2;

import java.util.Scanner;

public class Boletin2_2 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
      System.out.println("Cantos grados centigrados fai hoxe?");
      float celsius= sc.nextFloat();
      float fahrenheit=((celsius*1.8f)+32f);
      float kelvin=(celsius+273.15f);
      System.out.println(celsius+"ºC son "+fahrenheit+"ºf y "+kelvin+" K");
    }
    
}
