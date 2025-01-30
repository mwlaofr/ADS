import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Círculo");
        System.out.println("2. Triângulo Retângulo");
        System.out.println("3. Retângulo");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        double area, perimetro;

        switch (opcao) {
            case 1:
                System.out.print("Digite o raio do círculo: ");
                double raio = scanner.nextDouble();
                area = Math.PI * raio * raio;
                perimetro = 2 * Math.PI * raio;
                System.out.println("Área = " + area);
                System.out.println("Perímetro = " + perimetro);
                break;
            case 2:
                System.out.print("Informe a base do triângulo retângulo: ");
                double base = scanner.nextDouble();
                System.out.print("Informe a altura do triângulo retângulo: ");
                double altura = scanner.nextDouble();
                area = (base * altura) / 2;
                perimetro = base + altura + Math.sqrt((base * base) + (altura * altura));
                System.out.println("Área = " + area);
                System.out.println("Perímetro = " + perimetro);
                break;
            case 3:
                System.out.print("Informe a base do retângulo: ");
                double baseRetangulo = scanner.nextDouble();
                System.out.print("Informe a altura do retângulo: ");
                double alturaRetangulo = scanner.nextDouble();
                area = baseRetangulo * alturaRetangulo;
                perimetro = 2 * (baseRetangulo + alturaRetangulo);
                System.out.println("Área = " + area);
                System.out.println("Perímetro = " + perimetro);
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
