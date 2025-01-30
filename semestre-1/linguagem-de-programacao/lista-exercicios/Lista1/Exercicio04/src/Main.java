import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double n1, n2, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite sua primeira nota:");
        n1 = in.nextDouble();

        System.out.println("Digite sua segunda nota:");
        n2 = in.nextDouble();

        result = (n1 + n2) /2;
        System.out.println("A média entre as notas apresentadas é: " + result);

    }
}