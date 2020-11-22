
package hilossolucion;

public class Hilossolucion {


    public static void main(String[] args) {
      
Hilos a,b,c,d;
    	a=new Hilos("Juan");
    	b=new Hilos("Pedro");
    	c=new Hilos("Pepe");
    	d=new Hilos("Javier");
   	 
    	a.start();
    	b.start();
    	c.start();
    	d.start();
    	try{
        		a.join();
       		b.join();
        		c.join();
        		d.join();
    	}catch(Exception e){
        		System.out.println("Error");
    	}
    	System.out.println("Hilo principal terminado");
	}
    
}

