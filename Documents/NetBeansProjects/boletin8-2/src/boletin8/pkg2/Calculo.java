
package boletin8.pkg2;

import java.util.Scanner;
public class Calculo {
     Scanner teclado = new Scanner(System.in);
    private float prezo_total;

    public void calcular() {

        System.out.println("Cal é o número de unidades vendidas?");
        int unidades = teclado.nextInt();
        System.out.println("E o prezo do artigo?(unidade)");
        float prezo = teclado.nextFloat();
        if (unidades < 100) {
            prezo_total = unidades * prezo;
        } else if (unidades < 200) {
            if (prezo > 4000) {
                prezo_total = prezo * unidades * 0.95f;
            } else {
                prezo_total = prezo * unidades * 0.98f;
            }
        } else {
            if (prezo > 4000) {
                prezo_total = prezo * unidades * 0.90f;
            } else {
                prezo_total = prezo * unidades * 0.92f;
            }

        }
        System.out.println("Unidades " + unidades + ".");
        System.out.println("Prezo unidad " + prezo + "€.");
        System.out.println("Prezo total " + prezo_total + "€.");
        System.out.println("Desconto " + (prezo * unidades - prezo_total) + "€.");
        
    }
}
    
