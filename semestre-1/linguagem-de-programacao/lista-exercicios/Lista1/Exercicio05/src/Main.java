import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double n1, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu valor em Km/h:");
        n1 = in.nextDouble();

        result = n1 * 1000;

        System.out.println("O valor digitado convertido para m/s é: " + result);

    }
}