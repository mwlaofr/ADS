import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        System.out.println("Formas de pagamento:");
        System.out.println("1. Débito");
        System.out.println("2. Crédito");
        System.out.println("3. Pix");
        System.out.print("Escolha a forma de pagamento: ");
        int opcaoPagamento = scanner.nextInt();

        double totalPagar = 0;

        switch (opcaoPagamento) {
            case 1:
                totalPagar = valorCompra * 0.95;
                break;
            case 2:
                System.out.print("Digite o número de parcelas: ");
                int parcelas = scanner.nextInt();
                if (parcelas <= 4) {
                    totalPagar = valorCompra * 1.02;
                } else {
                    totalPagar = valorCompra * 1.05;
                }
                break;
            case 3:
                totalPagar = valorCompra * 0.90;
                break;
            default:
                System.out.println("Opção de pagamento inválida!");
                return;
        }

        System.out.println("Total a pagar: R$ " + totalPagar);

    }
}
