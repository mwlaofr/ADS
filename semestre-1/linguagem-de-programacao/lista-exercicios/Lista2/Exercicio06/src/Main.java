import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double opcao;
        Scanner in = new Scanner(System.in);
        System.out.println("Escolha uma opção entre 5 e 9:");
        opcao = in.nextDouble();

        if (opcao >= 5 && opcao <= 9) {
            System.out.println("Você escolheu a opção " + opcao);

        } else {
            System.out.println("Opção inválida!");

        }
    }
}