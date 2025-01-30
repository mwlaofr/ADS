import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um valor:");
        n1 = in.nextDouble();

        System.out.println("Tabuada de " + n1 + ":");
        for ( int i = 0; i <= 10; i++) {
            result = n1 * i;
            System.out.println(n1 + " * " + i + " = " + result);
        }
    }
}