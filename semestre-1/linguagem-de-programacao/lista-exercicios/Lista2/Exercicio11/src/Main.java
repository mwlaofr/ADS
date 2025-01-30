import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7");
        n1 = in.nextInt();

        String diaSemana= "";
        switch (n1) {
            case 1:
                diaSemana = "domingo";
                break;
            case 2:
                diaSemana = "segunda-feira";
                break;
            case 3:
                diaSemana = "terça-feira";
                break;
            case 4:
                diaSemana = "quarta-feira";
                break;
            case 5:
                diaSemana = "quinta-feira";
                break;
            case 6:
                diaSemana = "sexta-feira";
                break;
            case 7:
                diaSemana = "sabado";
                break;
            default:
                diaSemana = "Número inválido";
                break;
        }

        System.out.println("O dia da semana correspondente ao número " + n1 + " é " + diaSemana);
    }
}