import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double n1, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu valor em graus celsius:");
        n1 = in.nextDouble();

        result = (n1 * 1.8) + 32;

        System.out.println("Seu valor convertido para fahrenheits: " + result);

    }
}