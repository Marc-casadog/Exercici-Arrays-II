package exercici3;

public class Main {
    public static void main(String[] args) {

    char[][] matriu = new char[5][5];

    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {

            if (i == 0 || i == 4 || i == j) {
                matriu[i][j] = 'X';
            } else {
                matriu[i][j] = ' ';
            }

            System.out.print(matriu[i][j] + " ");
        }

        System.out.println();
    }
    }
}
 
