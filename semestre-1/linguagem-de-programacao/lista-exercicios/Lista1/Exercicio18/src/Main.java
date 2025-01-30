import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double n1, n2,result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor A de uma equação de primeiro grau:");
        n1 = in.nextDouble();

        System.out.println("Digite o valor B de uma equação de primeiro grau");
        n2 = in.nextDouble();

        result = -n2/n1;
        System.out.println("O valor de X é: " + result);

    }
}