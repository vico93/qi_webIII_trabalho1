
package View;
import java.util.Scanner;
import Model.Modelo;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Modelo modelo = new Modelo();
        
        System.out.println("Digite o nome do modelo: ");
        modelo.setNome(in.next());
        System.out.println("Digite a altura do modelo: ");
        modelo.setAltura(in.nextDouble());
        System.out.println("Digite o peso do modelo: ");
        modelo.setPeso(in.nextDouble());
        System.out.println("Digite a cor dos olhos do modelo: ");
        modelo.setCorOlhos(in.next());
        System.out.println("Digite a cor dos cabelos: ");
        modelo.setCorCabelo(in.next());
        System.out.println("Selecione o sexo do modelo: ");
        System.out.println("1 - Feminino");
        System.out.println("2 - Masculino");
        modelo.setSexo(in.nextByte());
        System.out.println(modelo);
    }
}
