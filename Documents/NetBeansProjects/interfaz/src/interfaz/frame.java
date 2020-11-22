
package interfaz;
import java.awt.Color;
import javax.swing.JFrame;

public class frame {
    
 JFrame frame; //variable
    panel comp;
    public frame(){ //constructor
    frame=new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Para cerrar el frame
    frame.getContentPane().setBackground(Color.blue); //color para el fondo del frame
    frame.getContentPane().setLayout(null);
    frame.setSize(1000, 600); // ancho por alto de la dmedida del frame
    comp = new panel(frame);
    frame.setUndecorated(true); // Desaparece el botón de menú del frame, queda solo el fondo
    frame.setLocationRelativeTo(null); //posicion del frame en el centro
    frame.setVisible(true); //muestra el frame, que sea visible en la pantalla.
    }
    
    public static void main(String []a){
        frame p=new frame(); //llama al constructor y ejecuta toda la instrucción anterior
        
    }
}