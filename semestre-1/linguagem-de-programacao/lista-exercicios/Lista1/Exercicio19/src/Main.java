import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o coeficiente a (diferente de 0):");
        double a = input.nextDouble();

        System.out.println("Digite o coeficiente b:");
        double b = input.nextDouble();

        System.out.println("Digite o coeficiente c:");
        double c = input.nextDouble();

        input.close();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (a == 0) {
            System.out.println("O valor de a deve ser diferente de 0.");
        } else if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("A equação tem duas raízes reais e distintas: x1 = " + x1 + " e x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("A equação tem uma raiz real dupla: x = " + x);
        } else {
            System.out.println("A equação não tem raízes reais.");
        }
    }
}