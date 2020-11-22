
package ejercicio1hilos;


public class hilitos extends Thread {
    
public hilitos(String nomb){
    	super(nomb);
	}
    
	@Override
	public void run(){
    	int rand=100+(int)(Math.random()*1000);
    	System.out.println(" Nombre: " + getName() + " Sleep: " + rand);
    	for(int i=0;i<5; i++){
        	System.out.println(" nombre: " +getName() + "; i=" + i);
        	try{
            	sleep(rand);
        	}catch(InterruptedException e){
            	System.out.println("Proceso terminado");
        	}
    	}
    	System.out.println("El hilo " + getName() + " Ha terminado");
	}
}
