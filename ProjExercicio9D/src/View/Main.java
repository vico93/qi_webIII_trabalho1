package View;

import Model.Lista;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // stdin
        Scanner stdin = new Scanner(System.in);

        // Objeto Padrão
        Lista l1 = new Lista();

        // Entrada de dados
        System.out.print("Digite X: ");
        l1.setX(stdin.nextInt());

        System.out.print("Digite Y: ");
        l1.setY(stdin.nextInt());

        System.out.print("Digite Z: ");
        l1.setZ(stdin.nextInt());

        // Saída
        System.out.println(l1);
        System.out.println("Maior número: " + l1.mostrarMaior());
        System.out.println("Menor número: " + l1.mostrarMenor());
    }
}
