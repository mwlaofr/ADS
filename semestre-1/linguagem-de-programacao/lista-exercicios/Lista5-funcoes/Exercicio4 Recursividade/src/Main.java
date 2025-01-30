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

        scanner.close();
    }

    public static boolean ehPalindromo(String texto) {
        texto = texto.replaceAll("\\s+", "").toLowerCase();
        return ehPalindromoRecursivo(texto, 0, texto.length() - 1);
    }

    public static boolean ehPalindromoRecursivo(String texto, int inicio, int fim) {
        if (inicio >= fim) {
            return true;
        }
        if (texto.charAt(inicio) != texto.charAt(fim)) {
            return false;
        }
        return ehPalindromoRecursivo(texto, inicio + 1, fim - 1);
    }
}
