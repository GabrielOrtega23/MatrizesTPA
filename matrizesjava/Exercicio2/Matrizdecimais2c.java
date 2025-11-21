package Exercicio2;
public class Matrizdecimais2c {
    public static void main(String[] args) {
        double[][] matriz = {
            {1.9, 2.5, 10.0},
            {1.0, 7.8, 2.5},
            {3.5, 2.2, 4.7}
        };

        for (double[] linha : matriz) {
            for (double v : linha) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
}

