import java.util.Scanner;

public class EX_01 {


    public static void main(String[] args) {
        Integer[] array1;
        array1 = new Integer[10];
        Scanner scn = new Scanner(System.in);
        int mayores =0;
        int iguales =0;
        int menores =0;
        for (int i = 0; i < 10; i++){

            System.out.println("Escriba los números");
            array1[i] = scn.nextInt();

            if (array1[i]==0) {
                iguales ++;
            }else if(array1[i]<0) {

                menores ++;

            }else {
                    mayores ++;

            }

        }
        System.out.println("Mayores que 0 = " + mayores);
        System.out.println("Iguales que 0 = " + iguales);
        System.out.println("Menores que 0 = " + menores);
    }

}
