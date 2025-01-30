import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu primeiro número inteiro:");
        n1 = in.nextDouble();
        System.out.println("Digite seu segundo número inteiro:");
        n2 = in.nextDouble();
        if (n1 > n2){
            System.out.println("O número " + n1 + " é maior que o número " + n2);

        } else if (n1 < n2) {
            System.out.println("O número " + n2 + " é maior que o número " + n1);

        }
    }
}