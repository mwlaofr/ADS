import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double x1,x2,b,c;
        Scanner in = new Scanner(System.in);
        System.out.println("x1:");
        x1=in.nextDouble();

        System.out.println("x1:");
        x2=in.nextDouble();

        b=-(x1+x2);
        c=x1*x2;

        System.out.println("X² + (" + b + "x) +" + c+" = 0");
    }
}