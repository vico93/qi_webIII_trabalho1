package View;

import Model.DataNascimento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Entrada padrão
        Scanner stdin = new Scanner(System.in);

        // Objeto padrão
        DataNascimento dN1 = new DataNascimento();

        // Processamento de entrada
        System.out.print("Digite o seu ano de nascimento: ");
        dN1.setAnoNascimento(stdin.nextInt());

        // Processamento de saída
        System.out.println(dN1);
        System.out.println("A sua idade pode ser expressada como: \n" +
                dN1.calcularIdade(1) + " anos, ou " +
                dN1.calcularIdade(2) + " meses, ou " +
                dN1.calcularIdade(3) + " dias, ou " +
                dN1.calcularIdade(4) + " horas, ou " +
                dN1.calcularIdade(5) + " minutos, ou " +
                dN1.calcularIdade(6) + " segundos."
        );
    }
}
