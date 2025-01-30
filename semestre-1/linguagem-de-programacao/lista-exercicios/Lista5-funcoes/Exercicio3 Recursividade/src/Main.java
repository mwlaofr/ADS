import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        int x = scanner.nextInt();

        int y;
        do {
            System.out.print("Digite o valor de Y (deve ser maior ou igual a zero): ");
            y = scanner.nextInt();
        } while (y < 0);

        System.out.println("O resultado de " + x + "^" + y + " é: " + calcularPotencia(x, y));

    }

    public static long calcularPotencia(int x, int y) {
        if (y == 0) {
            return 1;
        }
        return x * calcularPotencia(x, y - 1);
    }
}
