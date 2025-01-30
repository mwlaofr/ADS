import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando os personagens
        Personagem jogador = criarPersonagem("Jogador", scanner);
        Personagem monstro = criarPersonagem("Monstro", scanner);

        // Luta entre os personagens
        while (jogador.estaVivo() && monstro.estaVivo()) {
            jogador.ataque(monstro);
            if (!monstro.estaVivo()) {
                System.out.println("O " + jogador.getNome() + " venceu!");
                break;
            }
            monstro.ataque(jogador);
            if (!jogador.estaVivo()) {
                System.out.println("O " + monstro.getNome() + " venceu!");
                break;
            }
        }

        scanner.close();
    }

    // Método para criar um personagem com um nome fornecido pelo jogador
    private static Personagem criarPersonagem(String tipo, Scanner scanner) {
        System.out.print("Digite o nome do " + tipo + ": ");
        String nome = scanner.nextLine();
        return new Personagem(nome);
    }
}
