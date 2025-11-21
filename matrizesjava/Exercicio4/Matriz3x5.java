package Exercicio4;
import java.util.*;
public class Matriz3x5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][5];
        HashSet<Integer> valores = new HashSet<>();
        boolean repetido = false;

        int pares = 0, impares = 0;

        System.out.println("Digite os valores da matriz 3x5:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                int v = sc.nextInt();

                if (valores.contains(v)) repetido = true;
                valores.add(v);

                if (v % 2 == 0) pares++;
                else impares++;

                matriz[i][j] = v;
            }
        }

        System.out.println("\nPossui repetidos? " + (repetido ? "Sim" : "Não"));
        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de ímpares: " + impares);

        sc.close();
    }
}
