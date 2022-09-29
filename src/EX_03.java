import java.util.Random;

public class EX_03 {

    public static void main(String[] args) {

        int[][] array1 = new int[4][5];
        int[][] array2 = new int[5][6];
        Random rnd = new Random();


        for (int fila = 0; fila < array1.length; fila++) {
            for (int columna = 0; columna < array1[fila].length; columna++) {
                array1[fila][columna] = rnd.nextInt(10);
                System.out.print(array1[fila][columna] + "\t");
            }
            System.out.println();

        }
        System.out.println(" ");

        for (int fila = 0; fila < array1.length; fila++) {
            for (int columna = 0; columna < array1[fila].length; columna++) {
                array2[fila][columna] = array1[fila][columna];
            }

            System.out.println();

        }
        int valor_f = 0;
        for (int fila = 0; fila < array2.length - 1; fila++) {
            int c = 0;
            for (c = 0; c < array2[fila].length - 1; c++) {
                valor_f += array2[fila][c];

            }
            array2[fila][c] = valor_f;
            valor_f = 0;
        }
        valor_f = 0;
        for (int columna = 0; columna < array2[0].length - 1; columna++) {
            int f = 0;
            for (f = 0; f < array2.length - 1; f++) {
                valor_f += array2[f][columna];

            }
            array2[f][columna] = valor_f;
            valor_f = 0;
        }
        for (int i=0; i<array2.length; i++) {
            array2[4][5]+=array2[i][5];
        }


        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + "\t");

            }
            System.out.println();

        }

    }
}






