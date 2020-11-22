
package exemgui1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventosClaseAnonima {

     JFrame marco;
    JPanel panel;
    JButton bVerde, bAzul;

    public EventosClaseAnonima() {
        marco = new JFrame(" EVENTO ");
        panel = new JPanel();
        bVerde = new JButton(" VERDE ");
        bAzul = new JButton(" AZUL ");
        marco.setSize(800, 500);
        panel.setSize(800, 500);

        // aplicamos os listener ( escoitadores) ao boton (aos componentes general)
        bVerde.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               panel.setBackground(Color.GREEN);
            }
            
            
            
            
        });
        bAzul.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent ae) {
             panel.setBackground(Color.BLUE);
            }
        
    });
        
        panel.add(bVerde);
        panel.add(bAzul);
        marco.add(panel);
        
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
    
    
    
}
