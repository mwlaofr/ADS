import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double n1, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o raio do seu circulo:");
        n1 = in.nextDouble();

        result = ((n1 * n1) * 3.1415);
        System.out.println("A área do circulo do raio apresentado é: " + result);

    }
}