import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de n para gerar a sequência de Fibonacci até o enésimo termo: ");
        int n = scanner.nextInt();

        System.out.println("Sequência de Fibonacci até o " + n + "º termo:");

        printFibonacciSequence(n);
    }

    public static void printFibonacciSequence(int n) {
        int primeiroTermo = 0;
        int segundoTermo = 1;

        // Exibe os dois primeiros termos da sequência de Fibonacci
        System.out.print(primeiroTermo + ", " + segundoTermo);

        // Calcula e exibe os próximos termos da sequência de Fibonacci
        for (int i = 2; i < n; i++) {
            int proximoTermo = primeiroTermo + segundoTermo;
            System.out.print(", " + proximoTermo);
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
    }
}