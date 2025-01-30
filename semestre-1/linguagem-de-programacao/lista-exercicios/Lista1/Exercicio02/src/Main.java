import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        double n1, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero:");
        n1 = in.nextInt();
        result = Math.pow(n1, 2);
        System.out.println("O quadrado do número digitado é: " + result);
    }
}