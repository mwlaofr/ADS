public class Main {
    public static void main(String[] args) {
        int [] vector = {0,1,2,3,4,5,6,7,8,9};
        int [] rotcev = new int[vector.length];

        for (int i= vector.length-1;i>=0;i--){
            rotcev[(vector.length-1)-i]=vector[i];
        }
        for (int n: vector){
            System.out.println(n + " ");
        }
        System.out.println();
        for (int n: rotcev){
            System.out.println(n + " ");
        }
    }
}