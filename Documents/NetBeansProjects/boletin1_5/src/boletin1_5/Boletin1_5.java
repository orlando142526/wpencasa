package boletin1_5;

import java.util.Scanner;
public class Boletin1_5 {

  
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc = new Scanner(System.in);
        System.out.println("Cantas millas queres pasar a metros?");
        float millas = sc.nextFloat();
        System.out.println("Son "+millas*1852+" metros");     
       
    }
    
}
