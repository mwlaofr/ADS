import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Numeros positivos divisiveis por 4 e menores que 200: ");

        for(int i =1;i<200;i++){
            if (i%4==0){
                System.out.println(i);
            }
        }
    }
}