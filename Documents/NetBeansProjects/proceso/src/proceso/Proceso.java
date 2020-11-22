
package proceso;

public class Proceso {

   
    public static void main(String[] args) {
       
        hilo caca = new hilo ("Hilo1");
        hilo caquita = new hilo ("Hilo2");
        hilo caqu = new hilo ("Hilo3");
        hilo caq = new hilo ("Hilo4");
        hilo caquta = new hilo ("Hilo5");
        
       
        caca.start();
        caquita.start();
        caqu.start();
        caq.start();
        caqu.start();
          
    }
    
}
