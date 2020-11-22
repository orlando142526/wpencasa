
package ejercicio2joptionpane;

import javax.swing.JOptionPane;

public class Ejercicio2joptionpane {

 
    public static void main(String[] args) {
 //pedir tres numeros y mostrarlos ordenados de mayor a menor
 int n1,n2,n3;
 n1=Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
 n2=Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
 n3=Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
 
 if ((n1>n2)&&(n2>n3)){
    JOptionPane.showMessageDialog(null, "orden: "+n1+"-"+n2+"-"+n3);  
 }
 else if ((n1>n3)&&(n3>n2)){
      JOptionPane.showMessageDialog(null, "orden: "+n1+"-"+n3+"-"+n2);
 }
 else if ((n2>n1)&&(n1>n3)){
      JOptionPane.showMessageDialog(null, "orden: "+n2+"-"+n1+"-"+n3);
 }
 else if ((n2>n3)&&(n3>n1)){
      JOptionPane.showMessageDialog(null, "orden: "+n2+"-"+n3+"-"+n1);
 }
 else if ((n3>n1)&&(n1>n2)){
     JOptionPane.showMessageDialog(null,"orden: "+n3+ "-"+n1+"-"+n2);
 }
 else{ 
     
        JOptionPane.showMessageDialog(null,"orden :"+n3+"-"+n2+"-"+n1);
    }
 

 
 
 
 
 
 
        
    }
    
}
