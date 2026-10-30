import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introdueix el nombre de fies");
    int n = sc.nextInt();

    System.out.println("Introdueix el nombre de columnes:");
    int m = sc.nextInt();

    int[][] matriu = new int[n][m];   // n es fila y m es columna
    int[] sumaColumnas = new int[m]; // es crea el vector.

    System.out.println("Matriu:");
    for (int i = 0; i < matriu.length; i++) {
        for (int j = 0; j < matriu[i].length; j++) {
            System.out.print(matriu[i][j] + "\t");
        }
        System.out.println();

    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            System.out.print("Introduce un número: ");
            matriu[i][j] = sc.nextInt();
        }
    }

    int suma = 0;
    for (int i = 0; i < matriu.length; i++) {
        for (int j = 0; j < matriu[i].length; j++) {
            suma += matriu[i][j];
        }
    }
    System.out.println("Suma total: " + suma);

    int suma = 0;

    for (int j = 0; j < m; j++) {
        for (int i = 0; i < n; i++) {
            sumaColumnas[j] += matriu[i][j];
        }


    }

    for (int i = 0; i < m; i++) {
        System.out.println("Suma columna " + i + ": " + sumaColumnas[i]);
    }
}



    