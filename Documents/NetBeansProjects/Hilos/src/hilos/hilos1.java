
package hilos;

/**
 *
 * @author orlan
 */
public class hilos1 extends Thread{
    public hilos1 (String nomb){
        super(nomb);
    }
  
    
    @Override
    public void run (){
        int rand = (int)(Math.random()*3000);
        System.out.println("Nombre : " + getName());
    for (int i = 0; i<=5 ; i++){
        System.out.println(i+getName());
        try{
            sleep(rand);
        }catch (InterruptedException e){
            System.out.println("Proceso terminado");
        }
    }    
         System.out.println("El hilo "+ getName() + " Ha terminado");
        
    }
    
    
}
