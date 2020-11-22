
package exemplocondicionales_1;

import java.util.Scanner;
public class Condicional {
    
    public void entrar(int edad){
       
        if(edad>=18)
            System.out.println("podes entrar");
        else 
            System.out.println("Non podes pasar");
        
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
