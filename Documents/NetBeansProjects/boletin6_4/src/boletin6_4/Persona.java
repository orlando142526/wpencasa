
package boletin6_4;

public class Persona {
private float diferencia;
    DatosPersona persona1 = new DatosPersona("Paco", 80);
    DatosPersona persona2 = new DatosPersona("Laura", 65);
    
    
    private static class DatosPersona {
        private String nome;
        private float peso;
        
        public DatosPersona() {
            
        }

        public DatosPersona(String nome, float peso) {
            this.nome = nome;
            this.peso = peso;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public float getPeso() {
            return peso;
        }

        public void setPeso(int peso) {
            this.peso = peso;
        }
        
    }
    
    public void calcularPeso(){
        if (persona1.getPeso() > persona2.getPeso()) {
            System.out.println("La persona que más pesa es "+persona1.getNome()+" con "+persona1.getPeso()+"kg");
        }
        else if (persona1.getPeso() < persona2.getPeso()) {
            System.out.println("La persona que más pesa es "+persona2.getNome()+" con "+persona2.getPeso()+"kg");
        }
        else{
            System.out.println("Pesan igual");
        }
        
        diferencia = Math.abs(persona1.getPeso() - persona2.getPeso());
        System.out.println("La diferencia de peso entre "+persona1.getNome()+" y "+persona1.getNome()+" es "+diferencia+"kg");
    }
}

