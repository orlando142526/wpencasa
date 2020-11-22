
package boletin4_3;


public class Circulo {
    private double radio;
    private final double Pi=3.14;
    
public Circulo(double r){
      radio=r;
}
public Circulo(){
    
}
public double getRadio(){
    return radio;
}
public void setRadio(double r){
    radio=r;
}
public double calcularArea(){
   double calcA=Pi*Math.pow(radio, 2);
   return calcA;
} 
public double calcularLonxitude(){
    double lonxitude=Pi*radio*2;
return lonxitude;
    
}
}
    

