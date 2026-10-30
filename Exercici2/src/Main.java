package exercici2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix el nombre de files:");
        int n = sc.nextInt();

        System.out.println("Introdueix el nombre de columnes:");
        int m = sc.nextInt();

        int[][] matriu = new int[n][m];
        int[][] resultats = new int[3][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Introdueix un numero a la fila " + i + ", columna " + j + ":");
                matriu[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < m; j++) {
            int suma = 0;
            int max = matriu[0][j];
            int min = matriu[0][j];

            for (int i = 0; i < n; i++) {
                suma += matriu[i][j];

                if (matriu[i][j] > max) {
                    max = matriu[i][j];
                }

                if (matriu[i][j] < min) {
                    min = matriu[i][j];
                }
            }

            resultats[0][j] = suma;
            resultats[1][j] = max;
            resultats[2][j] = min;
        }

        for (int j = 0; j < m; j++) {
            System.out.println("Columna " + j);
            System.out.println("Suma: " + resultats[0][j]);
            System.out.println("Maxim: " + resultats[1][j]);
            System.out.println("Minim: " + resultats[2][j]);
        }

        sc.close();
    }
}
