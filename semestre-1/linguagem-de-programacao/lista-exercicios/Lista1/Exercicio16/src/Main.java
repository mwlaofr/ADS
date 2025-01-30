import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double n1, n2, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o raio do cone:");
        n1 = in.nextDouble();

        System.out.println("Digite a altura do cone:");
        n2 = in.nextDouble();

        result = (((n1*n1) * n2) * 3.1415 * 0.3333);
        System.out.println("O volume do cone é: " + result);

    }
}