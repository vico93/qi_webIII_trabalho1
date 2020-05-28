
package View;
import java.util.Scanner;
import Model.Produto;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Produto produto = new Produto();
        
        System.out.println("Digite o nome do produto: ");
        produto.setNome(in.next());
        System.out.println("Digite o valor unitário: ");
        produto.setValor(in.nextDouble());
        System.out.println("Digite a quantidade: ");
        produto.setQuantidade(in.nextInt());
        System.out.println(produto);
    }
}
