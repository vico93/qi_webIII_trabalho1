/*Crie um algoritmo que receba um personagem de um jogo de RPG. O personagem deve ter
nome, idade, altura, peso, sexo, raça, classe e uma arma. Classe e raça devem estar em um formato de menu.*/
package Model;

public class Personagem {
    
    private String nome;
    private byte idade;
    private double altura;
    private double peso;
    private byte sexo;
    private byte raca;
    private byte classe;
    private String arma;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public byte getRaca() {
        return raca;
    }

    public void setRaca(byte raca) {
        this.raca = raca;
    }

    public byte getClasse() {
        return classe;
    }

    public void setClasse(byte classe) {
        this.classe = classe;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public byte getSexo() {
        return sexo;
    }

    public void setSexo(byte sexo) {
        this.sexo = sexo;
    }
    
    
    
    public String escolherClasse(){
        String classePersonagem;
        switch(this.classe){
            case 1: 
                classePersonagem = "Guerreiro";
                break;
            case 2:
                classePersonagem = "Arqueiro";
                break;
            case 3:
                classePersonagem = "Mago";
                break;
            case 4:
                classePersonagem = "Sacerdote";
                break;
            case 5:
                classePersonagem = "Assassino";
                break;
            default:
                classePersonagem = "The True Class - Deprived";
        }
        return classePersonagem;
    }
    
    public String escolherRaca(){
        String racaPersonagem;
        switch(this.raca){
            case 1:
                racaPersonagem = "Humano(a)";
                break;
            case 2:
                racaPersonagem = "Elfo(a)";
                break;
            case 3:
                racaPersonagem = "Anão(ã)";
                break;
            case 4:
                racaPersonagem = "Anjo(a)";
                break;
            case 5:
                racaPersonagem = "Demônio(a)";
                break;
            default:
                racaPersonagem = "Hollow";
        }
        return racaPersonagem;
    }
    
    public String escolherSexo(){
        String sexoPersonagem;
        switch(this.sexo){
            case 1:
                sexoPersonagem = "Masculino";
                break;
            case 2:
                sexoPersonagem = "Feminino";
                break;
            default:
                sexoPersonagem = "Indefinido";
        }
        return sexoPersonagem;
    }
    
    public String toString(){
        return "\nNome do personagem: "+this.nome+
                "\nIdade do personagem: "+this.idade+
                "\nAltura do personagem: "+this.altura+
                "\nPeso do personagem: "+this.peso+
                "\nSexo do personagem: "+this.escolherSexo()+
                "\nClasse do personagem: "+this.escolherClasse()+
                "\nRaça do personagem: "+this.escolherRaca()+
                "\nArma do personagem: "+this.arma;
                
    }
    
}
