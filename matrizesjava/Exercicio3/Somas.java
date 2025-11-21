package Exercicio3;
import java.util.Scanner;

public class Somas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[5][5];
        int somaImpares = 0;

        System.out.println("Digite os valores da matriz 5x5:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] % 2 != 0) somaImpares += matriz[i][j];
            }
        }

        System.out.println("\nSoma dos ímpares: " + somaImpares);

        System.out.println("\nSoma das colunas:");
        for (int c = 0; c < 5; c++) {
            int soma = 0;
            for (int l = 0; l < 5; l++) soma += matriz[l][c];
            System.out.println("Coluna " + (c + 1) + ": " + soma);
        }

        System.out.println("\nSoma das linhas:");
        for (int l = 0; l < 5; l++) {
            int soma = 0;
            for (int c = 0; c < 5; c++) soma += matriz[l][c];
            System.out.println("Linha " + (l + 1) + ": " + soma);
        }

        sc.close();
    }
}

