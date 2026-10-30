package exercici4;

public class Main {
    public static void main(String[] args) {

    int n = 5;
    char[][] matriz = new char[n][n];

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {

            if (i == j || i + j == 4) {
                matriz[i][j] = 'X';
            } else {
                matriz[i][j] = ' ';
            }

            System.out.print("[" + matriz[i][j] + "] ");
        }

        System.out.println();
    }
    }
}
