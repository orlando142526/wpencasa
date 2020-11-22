
package boletin3_1;

public class Consumo {
    private float km;
    private float litros;
    private float vMed;
    private float pGas;
    
    //Un contrstuctor
    public Consumo (){
        
    }

    public Consumo(float km, float litros, float vMed, float pGas) {
        this.km = km;
        this.litros = litros;
        this.vMed = vMed;
        this.pGas = pGas;
    }

    public float getTempo(){
        float tempo = km/vMed;
        return tempo;
    }
    public float consumoMedio(){
        float consumoM = litros / km *100;
        return consumoM;
    }
    public float consumoEuros(){
        float consumoE = km / vMed;
       return consumoE;
    }
    

    public void setKm(float km) {
        this.km = km;
    }

    public void setLitros(float litros) {
        this.litros = litros;
    }

    public void setvMed(float vMed) {
        this.vMed = vMed;
    }

    public void setpGas(float pGas) {
        this.pGas = pGas;
    }
    public float getVMed(){
    float velocidadmedia = vMed;
    return velocidadmedia;
    }
    
        
    }
    
   