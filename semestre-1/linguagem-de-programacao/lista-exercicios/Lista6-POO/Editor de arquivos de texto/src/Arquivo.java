public class Arquivo {
    private String nome;
    private int tamanho;
    private String conteudo;

    // Construtor da classe
    public Arquivo(String nome) {
        this.nome = nome;
        this.tamanho = 0;
        this.conteudo = "";
    }

    // Método para abrir o arquivo
    public void abrir() {
        System.out.println("Nome do arquivo: " + nome);
        System.out.println("Tamanho do arquivo: " + tamanho + " bytes");
        System.out.println("Conteúdo do arquivo: " + conteudo);
    }

    // Método para editar o arquivo
    public void editar(String texto) {
        conteudo += texto;
        tamanho = conteudo.length(); // Atualiza o tamanho do arquivo
    }

    // Método para renomear o arquivo
    public void renomear(String novoNome) {
        nome = novoNome;
    }

    // Método para limpar o conteúdo do arquivo
    public void limpar() {
        conteudo = "";
        tamanho = 0;
    }
}
