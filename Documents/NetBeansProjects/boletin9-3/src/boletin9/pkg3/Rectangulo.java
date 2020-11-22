
package boletin9.pkg3;
import java.util.Scanner;
public class Rectangulo {
     private double base;
    private double area;
    private double altura;
    Scanner sc = new Scanner(System.in);
    
    public double pedirBase(){
    System.out.print("Teclea la base: ");
    base = sc.nextDouble();
    return base;
    }
    public double pedirAltura(){
    System.out.print("Teclea la altura: ");
    altura = sc.nextDouble();
    return altura;
    }
    public void CalcularArea(){
    do{
        base=pedirBase();
        altura=pedirAltura();
        area = base * altura;
        }while(altura<0 || base<0);
        System.out.println("A area de un rectángulo é "+area);
    }
    
}

