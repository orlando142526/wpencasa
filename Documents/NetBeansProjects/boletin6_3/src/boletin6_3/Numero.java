
package boletin6_3;


public class Numero {
    private float num;
    private String valor;

    public Numero() {
    }

    public Numero(float num) {
        this.num = num;
    }

    public float getNum() {
        return num;
    }

    public void setNum(float num) {
        this.num = num;
    }
    public String condicional(){
        if (num > 0) {
            valor = "+";
        }
        else if(num < 0){
            valor = "-";
        }
        else{
            valor = "0";
        }
        return valor;
    }
}



