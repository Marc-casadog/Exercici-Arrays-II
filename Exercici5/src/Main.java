package exercici5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[][] matriz = new int[20][6];

    // Introduir les 3 notes de cada alumne
    for (int i = 0; i < 20; i++) {

        for (int j = 0; j < 3; j++) {

            System.out.println("Introduce la nota " + (j + 1) + " del alumno " + (i + 1) + ":");
            matriz[i][j] = sc.nextInt();

        }
    }

    //  Calcular mitja, nota màxima y nota mínima
    for (int i = 0; i < 20; i++) {

        int suma = 0;
        int maximo = matriz[i][0];
        int minimo = matriz[i][0];

        for (int j = 0; j < 3; j++) {

            suma = suma + matriz[i][j];

            if (matriz[i][j] > maximo) {
                maximo = matriz[i][j];
            }

            if (matriz[i][j] < minimo) {
                minimo = matriz[i][j];
            }
        }

        matriz[i][3] = suma / 3;
        matriz[i][4] = maximo;
        matriz[i][5] = minimo;
    }

    // C. Mostrar la matriz completa
    System.out.println("Matriu:");

    for (int i = 0; i < 20; i++) {

        for (int j = 0; j < 6; j++) {
            System.out.print(matriz[i][j] + "\t");
        }

        System.out.println();
    }
    }
}
