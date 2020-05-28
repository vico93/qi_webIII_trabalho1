package View;

/* Imports */
// Globais
import java.sql.SQLOutput;
import java.util.Scanner;
// Locais
import Model.Aluno;

public class Main {
    public static void main(String[] args) {
        // User-Input
        Scanner entrada = new Scanner(System.in);

        // Objeto principal
        Aluno golias = new Aluno();

        // Entrada de dados
        System.out.print("Digite o nome do aluno: ");
        golias.setNomeAluno(entrada.nextLine());

        System.out.print("Digite a primeira nota: ");
        golias.setNota1(entrada.nextDouble());

        System.out.print("Digite a segunda nota: ");
        golias.setNota2(entrada.nextDouble());

        System.out.print("Digite as faltas do aluno: ");
        golias.setFaltas(entrada.nextInt());

        System.out.print("Digite o total de aulas ministradas pelo profe: ");
        golias.setTotalAulas(entrada.nextInt());

        // Processamento e exibição
        System.out.println("\n\n\n");
        System.out.println(golias);
        System.out.println("Média final: " + String.format("%.2f", golias.calcularMedia()));
        System.out.println("Frequência: " + golias.calcularFrequencia() + "%");
        System.out.println(golias.calcularResultadoFinal());

    }
}
