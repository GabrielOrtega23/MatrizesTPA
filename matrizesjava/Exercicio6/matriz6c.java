package Exercicio6;
public class matriz6c {
    public static void main(String[] args) {
        String[][] matriz = new String[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[i][j] = "*";
            }
        }

        // Exibe a figura
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] == null)
                    System.out.print("  ");
                else
                    System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
