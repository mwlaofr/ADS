public class Main {
    public static void main(String[] args) {
        int[][] matrix_a = {{5, 6},
                {8, 7},
                {3, 3}};

        int[][] matrix_b = {{9, 1},
                {6, 1}};
        int[][] matrix_product = new int[matrix_a.length][matrix_b[0].length];
        if (matrix_a[0].length == matrix_b.length) {
            for (int i = 0; i < matrix_a.length; i++) {
                int aux_p=1;
                for (int j = 0; j < matrix_a[0].length; j++) {

                }
            }
        } else {
            System.out.println("Impossível multiplicar");
        }
    }
}