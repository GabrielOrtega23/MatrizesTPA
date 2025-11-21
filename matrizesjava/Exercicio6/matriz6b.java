package Exercicio6;
public class matriz6b {
    public static void main(String[] args) {
        String[][] matriz = new String[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                // Borda superior, inferior, esquerda ou direita
                if (i == 0 || i == 3 || j == 0 || j == 3) {
                    matriz[i][j] = "*";
                } else {
                    matriz[i][j] = " ";
                }
            }
        }

        // Exibe a figura
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
