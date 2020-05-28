package View;

import Model.Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // User Input
        Scanner entrada = new Scanner(System.in);

        // Objeto principal
        Calculadora casioFajuta = new Calculadora();

        // Menu para o usuário:
        System.out.println("+---------------------------+\n" +
                "|                           |\n" +
                "| CALCULADORA CASIO-FAJUTA! |\n" +
                "|                           |\n" +
                "+---------------------------+\n");

        System.out.print("Digite o #1: ");
        casioFajuta.setNumero1(entrada.nextDouble());
        System.out.print("Digite o #2: ");
        casioFajuta.setNumero2(entrada.nextDouble());

        System.out.println("+---------------------------+\n" +
                "|  OPÇÕES!                  |\n" +
                "|  1 > SOMAR VALORES        |\n" +
                "|  2 > MULTIPLICAR VALORES  |\n" +
                "|  3 > SUBTRAIR #1 DO #2    |\n" +
                "|  4 > SUBTRAIR #2 DO #1    |\n" +
                "|  5 > RAIZ QUADRADA DO #1  |\n" +
                "|  6 > RAIZ QUADRADA DO #2  |\n" +
                "|  7 > QUADRADO DO #1       |\n" +
                "|  8 > SOMAR VALOR AO #1    |\n" +
                "|  9 > SOMAR VALOR AO #2    |\n" +
                "|                           |\n" +
                "+---------------------------+\n");
        System.out.print("Digite a opção desejada: ");
        // Lê a opção desejada em uma váriável
        int opcao = entrada.nextInt();
        System.out.println(casioFajuta);
        switch(opcao) {
            case 1:
                System.out.println("Resultado da soma: " + casioFajuta.somar());
                break;
            case 2:
                System.out.println("Resultado da multiplicação: " + casioFajuta.multiplicar());
                break;
            case 3:
                System.out.println("Resultado da subtração: " + casioFajuta.subtrair1Do2());
                break;
            case 4:
                System.out.println("Resultado da subtração: " + casioFajuta.subtrair2Do1());
                break;
            case 5:
                System.out.println("Raiz quadrada é: " + casioFajuta.calcularRaizQuadradaDo1());
                break;
            case 6:
                System.out.println("Raiz quadrada é: " + casioFajuta.calcularRaizQuadradaDo2());
                break;
            case 7:
                System.out.println("O quadrado de #1 é: " + casioFajuta.calcular1AoQuadrado());
                break;
            case 8:
                System.out.print("Digite o valor à somar ao #1: ");
                double valorExtra1 = entrada.nextDouble();
                System.out.println("Resultado: " + casioFajuta.somarUmValorAo1(valorExtra1));
                break;
            case 9:
                System.out.print("Digite o valor à somar ao #1: ");
                double valorExtra2 = entrada.nextDouble();
                System.out.println("Resultado: " + casioFajuta.somarUmValorAo2(valorExtra2));
                break;
            default:
                System.out.println("[ERRO] Opção inválida! O programa será encerrado!");
        }
    }
}
