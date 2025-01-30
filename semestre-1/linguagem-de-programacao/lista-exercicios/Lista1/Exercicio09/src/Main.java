import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double n1, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite sua distancia em quilometros:");
        n1 = in.nextDouble();

        result = n1 / 1.609;

        System.out.println("A distancia em milhas é: " + result);

    }
}