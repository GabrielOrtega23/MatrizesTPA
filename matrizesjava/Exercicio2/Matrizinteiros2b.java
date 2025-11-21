package Exercicio2;
public class Matrizinteiros2b {
    public static void main(String[] args) {
        int[][] matriz = {
            {19, 25, 100, 99},
            {10, 7, 25, 14},
            {35, 2, 47, 74}
        };

        for (int[] linha : matriz) {
            for (int v : linha) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
}

