
package exemplocondicionales_2;
import java.util.Scanner;

public class Condicional {
    public void entrar(int edad){
       
        if(edad==18)
            System.out.println("queda na porta");
        else if(edad<18) 
            System.out.println("non entra");
        else 
            System.out.println("entra");
        System.out.println("chao");
        System.out.println("");
       
        
    }
    public int pedirInt(){
          Scanner sc=new Scanner(System.in);
        System.out.println("edade: ");
        int ed=sc.nextInt();
        return ed;
    }
    public String permiso(int edad){
        if(edad<18)
            return ("non entras");
        else
            return("entras");
    
}
}