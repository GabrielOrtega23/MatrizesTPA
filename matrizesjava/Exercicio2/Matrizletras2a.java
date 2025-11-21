package Exercicio2;

public class Matrizletras2a {
    public static void main(String[] args) {
        char[][] matriz = {
            {'a','b','c','d','e'},
            {'f','g','h','i','j'},
            {'l','m','n','o','p'},
            {'q','r','s','t','u'}
        };

        for (char[] linha : matriz) {
            for (char c : linha) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}

