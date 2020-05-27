package View;

import Model.Funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instancia o objeto de user input
        Scanner entrada = new Scanner(System.in);

        // Cria o objeto principal da classe
        Funcionario badanha = new Funcionario();

        // Pede e lê cada dado - atributo
        System.out.print("Digite o nome do funcionário: ");
        badanha.setNome(entrada.nextLine());

        System.out.print("Digite o salário fixo do " + badanha.getNome() + ": ");
        badanha.setSalarioFixo(entrada.nextDouble());

        System.out.print("Digite o valor mensal das vendas do " + badanha.getNome() + ": ");
        badanha.setValorVendas(entrada.nextDouble());

        // Invoca os métodos e mostra resultados
        System.out.println(badanha);
        System.out.println("COMISSÃO: " + String.format("R$ %.2f", badanha.calcularComissao()));
        System.out.println("SALÁRIO FINAL: " + String.format("R$ %.2f", badanha.calcularSalarioFinal()));
    }
}
