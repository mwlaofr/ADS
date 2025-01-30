import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String texto = scanner.nextLine();

        if (ehPalindromo(texto)) {
            System.out.println("A palavra/frase \"" + texto + "\" é um palíndromo.");
        } else {
            System.out.println("A palavra/frase \"" + texto + "\" não é um palíndromo.");
        }

    }

    public static boolean ehPalindromo(String texto) {

        texto = texto.replaceAll("\\s+", "").toLowerCase();

        int i = 0;
        int j = texto.length() - 1;

        while (i < j) {
            if (texto.charAt(i) != texto.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
