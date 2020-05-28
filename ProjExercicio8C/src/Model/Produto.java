
package Model;

public class Produto {
    
    private String nome;
    private double valor;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public double calcularValorTotal(){
        return this.valor * this.quantidade;
    }
    
    public String toString(){
        return "\nNome do produto: "+this.nome+
                "\nValor do produto: R$"+this.valor+
                "\nQuantidade: "+this.quantidade+" unidade(s)"+
                "\nValor total: "+this.calcularValorTotal();
    }
    
}
