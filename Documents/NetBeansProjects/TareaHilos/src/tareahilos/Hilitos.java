
package tareahilos;


public class Hilitos extends Thread {
int num_int;
public Hilitos(String NombreHilo){
    super(NombreHilo);
}
    @Override
    public void run(){
        for (int i = 0; i <=num_int; i++){
            System.out.println(i+this.getName()); 
        }
        System.out.println("");
    }
    
    public void ValorDeLaConcurrencia(int valor){
        this.num_int = valor;
    }
    
}
