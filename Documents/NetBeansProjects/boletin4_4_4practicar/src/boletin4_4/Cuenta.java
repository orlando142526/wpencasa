
package boletin4_4;


public class Cuenta {
    private String cliente;
    private String conta;
    private double interese;
    private double saldo;
    
    public Cuenta (String client, String cont, double inter, double sal){
        String cliente = client;
        String conta = cont;
        double interse = inter;
        double saldo = sal;    
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getInterese() {
        return interese;
    }

    public void setInterese(double interese) {
        this.interese = interese;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void ingreso(double cantidad){;
    saldo += cantidad;
    
    }
    
    public void reintegro (double cantidad){;
    saldo -= Math.abs(cantidad);
        
    }
    
    public void transferencia(Cuenta destino, double cantidad){
       saldo -= Math.abs(cantidad);
       destino.setSaldo(destino.getSaldo()+cantidad);
       
    }
    
}