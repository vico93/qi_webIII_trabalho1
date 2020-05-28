
package View;
import java.util.Scanner;
import Model.Funcionario;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        
        System.out.println("Digite o nome do funcionário: ");
        funcionario.setNome(in.next());
        System.out.println("Digite o valor da hora do funcionário: ");
        funcionario.setValorHora(in.nextDouble());
        System.out.println("Digite a carga horária do funcionário: ");
        funcionario.setCargaHoraria(in.nextDouble());
        System.out.println(funcionario);
    }
}
