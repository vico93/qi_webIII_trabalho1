
package View;
import java.util.Scanner;
import Model.Aluno;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Aluno aluno = new Aluno();
        
        System.out.println("Digite a primeira nota: ");
        aluno.setNota1(in.nextDouble());
        System.out.println("Digite a segunda nota: ");
        aluno.setNota2(in.nextDouble());
        System.out.println("Digite a terceira nota: ");
        aluno.setNota3(in.nextDouble());
        System.out.println("Digite a quarta nota: ");
        aluno.setNota4(in.nextDouble());
        System.out.println("----------------------");
        System.out.println(aluno);
    }
}
