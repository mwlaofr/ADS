import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double n1, n2, n3,result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a velocidade inicial:");
        n1 = in.nextDouble();

        System.out.println("Digite a aceleração:");
        n2 = in.nextDouble();

        System.out.println("Digite o tempo de percurso:");
        n3 = in.nextDouble();

        result = (n1 + n2 * n3);
        System.out.println("A velocidade do corpo é: " + result);

    }
}