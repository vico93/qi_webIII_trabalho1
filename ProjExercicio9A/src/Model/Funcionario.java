package Model;

public class Funcionario {
    // Atributos
    private String nome;
    private double salarioFixo;
    private double valorVendas;
    // Acessores
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalarioFixo() {
        return salarioFixo;
    }
    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
    public double getValorVendas() {
        return valorVendas;
    }
    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    // Métodos
    public double calcularComissao(){
        return this.valorVendas * 0.04;
    }
    public double calcularSalarioFinal(){
        return this.salarioFixo + this.calcularComissao();
    }

    // toString
    @Override
    public String toString() {
        return "Funcionário: " + nome +
                "\nSalário Fixo: " + String.format("R$ %.2f", salarioFixo) +
                "\nValor total de vendas: " + String.format("R$ %.2f", valorVendas);
    }
}
