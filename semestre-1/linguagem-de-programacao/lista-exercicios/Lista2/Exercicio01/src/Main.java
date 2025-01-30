import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero real:");
        n1 = in.nextDouble();
        if (n1 >= 0){
            double raiz = Math.sqrt(n1);

            System.out.println("A raiz quadrada de " + n1 + " é: " + raiz);

        }
        else {
            System.out.println("Valor inválido");
        }
    }
}