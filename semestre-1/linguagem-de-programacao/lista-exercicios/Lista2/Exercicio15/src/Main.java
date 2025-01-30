import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o dinheiro: ");
        double valorInserido =scanner.nextDouble();

        System.out.println("Menu:");
        System.out.println("1. Café Expresso R$ 0,50");
        System.out.println("2. Café Longo R$ 1,00");
        System.out.println("3. Capuccino R$ 2,50");
        System.out.println("4. Chocolate R$ 2,00");

        System.out.println("Escolha uma Opção (1, 2, 3 ou 4):");
        int Bebida = scanner.nextInt();

        String bebidaSelecionada = "";
        double precoBebida = 0;

        switch (Bebida) {
            case 1:
                bebidaSelecionada = "Café";
                precoBebida = 1.50;
                break;
            case 2:
                bebidaSelecionada = "Café com Leite";
                precoBebida = 2.50;
                break;
            case 3:
                bebidaSelecionada = "Cappuccino";
                precoBebida = 3.00;
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        if (valorInserido >= precoBebida) {

            double troco = valorInserido - precoBebida;


            System.out.println("Bebida selecionada: " + bebidaSelecionada);
            System.out.printf("Troco: R$ %.2f%n", troco);
        } else {
            System.out.println("Valor inserido não é suficiente para comprar a bebida selecionada.");
        }

    }
}