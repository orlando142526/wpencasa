
package exemploobxectos;

public class ExemploObxectos {

 
    public static void main(String[] args) {
         // instanciamos un obxecto
      Alumno pepito=new Alumno();
      pepito.amosar();
      Alumno antia=new Alumno("ant",8);
      antia.amosar();
      antia.setNome("Lucia");
   System.out.println("****"+antia.getNome());
      
    }
    
}
