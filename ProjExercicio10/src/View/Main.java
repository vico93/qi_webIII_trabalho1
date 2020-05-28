
package View;
import java.util.Scanner;
import Model.Personagem;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Personagem personagem = new Personagem();
        
        System.out.println("Digite o nome do personagem: ");
        personagem.setNome(in.next());
        
        System.out.println("Digite a idade do personagem: ");
        personagem.setIdade(in.nextByte());
        
        System.out.println("Digite a altura do personagem: ");
        personagem.setAltura(in.nextDouble());
        
        System.out.println("Digite o peso do personagem: ");
        personagem.setPeso(in.nextDouble());
        
        System.out.println("Escolha o sexo do personagem: ");
        System.out.println("1 - Masculino");
        System.out.println("2 - Feminino");
        personagem.setSexo(in.nextByte());
        
        System.out.println("Escolha a classe do personagem: ");
        System.out.println("1 - Guerreiro");
        System.out.println("2 - Arqueiro");
        System.out.println("3 - Mago");
        System.out.println("4 - Sacerdote");
        System.out.println("5 - Assassino");
        personagem.setClasse(in.nextByte());
        
        System.out.println("Escolha a raça do personagem: ");
        System.out.println("1 - Humano(a)");
        System.out.println("2 - Elfo(a)");
        System.out.println("3 - Anão(ã)");
        System.out.println("4 - Anjo(a)");
        System.out.println("5 - Demônio(a)");
        personagem.setRaca(in.nextByte());
        
        System.out.println("Digite o nome de sua arma. Seja criativo: ");
        personagem.setArma(in.next());
        
        System.out.println(personagem);
    }
}
