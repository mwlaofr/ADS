import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, result;

        Scanner in = new Scanner(System.in);
        System.out.println("Dgite um número inteiro");
        n1 = in.nextInt();
        result = 2*n1;
        System.out.println("o dobro do numero digitado é: " + result);

    }
}