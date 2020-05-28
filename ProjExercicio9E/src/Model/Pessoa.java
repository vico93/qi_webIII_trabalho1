package Model;

public class Pessoa {
    // Atributos
    private String nome;
    private double peso;
    private double altura;
    // Acessores
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Métodos
    public double calcularIMC() {
        return this.peso / Math.pow(this.altura, 2);
    }

    // toString
    @Override
    public String toString() {
        return "Seu nome: " + nome +
                "\nSeu peso: " + String.format("%.2f", peso) + "kg" +
                "\nSua altura: " + String.format("%.2f", altura) + "m";
    }
}
