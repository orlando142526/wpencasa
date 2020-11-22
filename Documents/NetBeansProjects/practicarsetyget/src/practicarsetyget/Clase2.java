
package practicarsetyget;

public class Clase2 {
     public static void main(String[] args) {
         Clase1 objeto1 = new Clase1();
         objeto1.setedad(10);
         System.out.println("tengo"+objeto1.getedad());
         
         objeto1.setnombre("Orlando");
         System.out.println("mi nombre es"+objeto1.getnombre());
         
        
     }
}
