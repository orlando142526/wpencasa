
package boletin6_5;


public class Numero {
    private float n1;
    private float n2;
    private float n3;

    public Numero() {
    }

    public Numero(float n1, float n2, float n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float getN3() {
        return n3;
    }

    public void setN3(float n3) {
        this.n3 = n3;
    }
    
    public void calcularMaior(){
        if (n1 > n2 && n1 > n3) {
            System.out.println(n1+" es el maior");
        }
        else if (n2 > n1 && n2 > n3){
            System.out.println(n2+" es el maior");
        }
        else if (n3 > n1 && n3 > n2){
            System.out.println(n3+" es el maior");
        }
    }
}