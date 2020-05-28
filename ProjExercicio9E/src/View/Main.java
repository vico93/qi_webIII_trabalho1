package View;

import Model.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // stdin
        Scanner stdin = new Scanner(System.in);

        // Objeto padrão
        Pessoa p1 = new Pessoa();

        // Entrada
        System.out.print("Digite o seu nome: ");
        p1.setNome(stdin.nextLine());

        System.out.print("Digite sua altura em metros: ");
        p1.setAltura(stdin.nextDouble());

        System.out.print("Digite seu peso, em kg: ");
        p1.setPeso(stdin.nextDouble());

        // Saída
        System.out.println(p1);

        double imc = p1.calcularIMC();

        System.out.println("Seu IMC: " + String.format("%.1f", imc));

        if ((imc >= 18.5) && (imc <= 24.9)) {
            System.out.println(p1.getNome() + ", você está no seu peso ideal!");
        }
        else {
            System.out.println(p1.getNome() + ", er, com todo o respeito, mas você está fora no seu peso ideal...");
        }
    }
}
