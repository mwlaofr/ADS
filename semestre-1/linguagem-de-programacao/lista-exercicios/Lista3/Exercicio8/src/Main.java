import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int n = in.nextInt();
        boolean eprimo=true;
        for(int i=n-1; i>1; i--) {
            if (n % i == 0) {
                eprimo = false;
            }
        }
            if (eprimo)
                System.out.println("Não é primo");
            else
                System.out.println("É primo");
            }
    }
