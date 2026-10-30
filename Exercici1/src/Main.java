package exercici1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introdueix el nombre de files:");
    int n = sc.nextInt();

    System.out.println("Introdueix el nombre de columnes:");
    int m = sc.nextInt();

    int[][] matriu =  new int[n][m];
    int[] sumes = new int[m];

    for (int i = 0; i < matriu.length; i++) {
        for (int j = 0; j < m; j++) {
            System.out.println("Introdueix un número a la fila:" + i + ", columna " + j + ":");
            matriu[i][j] = sc.nextInt();

        }

    }

    for (int j = 0; j < m; j++) {
       sumes[j] = 0;

       for (int i = 0; i < n; i++) {
           sumes[j] += matriu[i][j];
       }
    }

    for (int j = 0; j < m; j++) {
        System.out.println("Suma columna" + j + ":" + sumes[j]);
    }




    }
}
