public class Main {
    public static void main(String[] args) {
        // Criando uma instância da classe Arquivo
        Arquivo arquivo = new Arquivo("arquivo.txt");

        // Abrir o arquivo
        arquivo.abrir();

        // Editando o arquivo
        arquivo.editar("Este é um arquivo de texto.\n");
        arquivo.editar("Aqui está o seu conteúdo.\n");

        // Visualizando as alterações
        arquivo.abrir();

        // Renomeando e limpando o arquivo
        arquivo.renomear("novo_arquivo.txt");
        arquivo.limpar();

        // Verificando as alterações
        arquivo.abrir();
    }
}
