import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, media, media2, nr;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        n1 = in.nextDouble();

        System.out.println("Digite a segunda nota:");
        n2 = in.nextDouble();

        media = (n1 + n2) / 2;

        System.out.println("Média:" + media);
        if (media >= 50){
            System.out.println("APROVADO");

        }
        else {
            System.out.println("REPROVADO");

            System.out.println("Digite a nota da prova de recuperação:");
            nr = in.nextDouble();

            media2 = (media + nr) /2;

            if (media2 >= 50) {
                System.out.println("Média:" + media2);
                System.out.println("APROVADO");
            }
            else {
                System.out.println("Média:" + media2);
                System.out.println("REPROVADO");
            }

        }
    }
}