import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double n1, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número real:");
        n1 = in.nextDouble();
        result = n1/5;
        System.out.println("A quinta parte do numero digitado é: " + result);
    }
}