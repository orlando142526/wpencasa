
package proceso;


public class hilo extends Thread {
    public hilo (String nomb){
        super(nomb);
    }
    
           
    @Override
   public void run (){
        
       for(int i=0; i>=10 ; i++){
           System.out.println("Nombre: "+getName()+i);
           
           try{
               sleep(6000);
           }catch(InterruptedException e){
               
           }
           
       }
        System.out.println("PROCESO TERMINADO");
    }
         
    
    
}
