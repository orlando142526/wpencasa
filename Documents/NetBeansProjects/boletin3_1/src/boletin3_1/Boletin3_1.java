
package boletin3_1;


public class Boletin3_1 {

  
    public static void main(String[] args) {
       Consumo consume = new Consumo();
       consume.setLitros(50);
       consume.setLitros(1.57f);
       
       Consumo consumo = new Consumo(300f,50f,80f,1.36f);
       System.out.println("Es"+consumo.consumoMedio());
       consume.setLitros(30f);
       System.out.println("Es"+consumo.getVMed());
       System.out.println("El consumo medio despues de cambios de litros del 2 objetos es"+consume.consumoMedio());
       
       
       
    }

}