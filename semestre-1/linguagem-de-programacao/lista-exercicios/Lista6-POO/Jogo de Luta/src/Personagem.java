import java.util.Random;

public class Personagem {
    private String nome;
    private int vida;
    private int ataque;
    private int defesa;

    // Construtor da classe
    public Personagem(String nome) {
        this.nome = nome;
        this.vida = 100; // A vida inicia sempre com 100
        this.ataque = gerarNumeroAleatorio(20, 30);
        this.defesa = gerarNumeroAleatorio(10, 15);
    }

    // Método para gerar um número aleatório dentro de um intervalo
    private int gerarNumeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    // Método para realizar um ataque ao adversário
    public void ataque(Personagem adversario) {
        int dano = this.ataque - adversario.defesa;
        if (dano < 0) {
            dano = 0; // Evita dano negativo
        }
        adversario.vida -= dano;
        System.out.println(this.nome + " atacou " + adversario.nome + " causando " + dano + " de dano.");
    }

    // Método para verificar se o personagem ainda está vivo
    public boolean estaVivo() {
        return vida > 0;
    }

    // Método para obter o nome do personagem
    public String getNome() {
        return nome;
    }

    // Método para obter a vida do personagem
    public int getVida() {
        return vida;
    }
}
