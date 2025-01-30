public class Main {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int elBuscado = 13;


        int posicao = buscaBinaria(array, elBuscado);

        if (posicao != -1) {
            System.out.println("O elemento " + elBuscado + " está na posição " + posicao + " do array.");
        } else {
            System.out.println("O elemento " + elBuscado + " não foi encontrado no array.");
        }
    }

    public static int buscaBinaria(int[] array, int elemento) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (array[meio] == elemento) {
                return meio;
            } else if (array[meio] < elemento) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1;
    }
}
