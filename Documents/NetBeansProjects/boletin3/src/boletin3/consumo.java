
package boletin3;

public class consumo {
    private float km;
    private float litros;
    private float vMed;
    private float pGas;

    public consumo(float kms, float l, float med, float gas){
        km=kms;
        litros=l;
        vMed=med;
        pGas=gas;
    }

 public consumo(){
     
 }

          
public float getTempo(){
    float tempo = km / vMed;
    return tempo;
 
 }
public float consumoMedio(){
    float consumoM = litros / km * 100;
    return consumoM;
}
public float consumoEuros(){
    float consumoE = km / vMed;
    return consumoE;
}
public void setKms (float kms){
    km = kms ;
}
public void setLitros (float l){
    litros = l;
}
public void setVMed(float med){
    vMed = med;
}
public void setPGas(float gas){
    pGas = gas;
}
public float getVMed(){
    float velocidadmedia = vMed;
    return velocidadmedia;
}
    
}  
    

