package View;

import Model.Abastecimento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // stdin
        Scanner stdin = new Scanner(System.in);

        // Objeto principal
        Abastecimento a1 = new Abastecimento();

        // Entrada
        System.out.println("+------------------------------------+\n" +
                "|  SELECIONE O TIPO DE COMBUSTÍVEL:  |\n" +
                "|  1 - Gasolina                      |\n" +
                "|  2 - Álcool                        |\n" +
                "|  3 - GNV                           |\n" +
                "|  4 - Diesel                        |\n" +
                "+------------------------------------+");
        a1.setTipoCombustivel(stdin.nextByte());

        System.out.println("+----------------------------+\n" +
                "| Digite o volume abastecido,|\n" +
                "| em litros (ou m³ para GNV) |\n" +
                "+----------------------------+");
        a1.setVolumeAbastecido(stdin.nextDouble());

        // Saída
        System.out.println("Valor à pagar: " + String.format("R$ %.2f", a1.calcularValorPagar()));
    }
}
