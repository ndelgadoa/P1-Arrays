import java.util.Scanner;

public class EX_02 {
    char[] arrayDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    Integer DNI;
    Integer resto = 0;

    public static void main(String[] args) {
        EX_02 objeto = new EX_02();
        Scanner scn = new Scanner(System.in);
        System.out.println("Escriba su DNI");

        objeto.DNI = scn.nextInt();
        objeto.resto = objeto.DNI % 23;
        char resultado = objeto.posicion();
        System.out.println(resultado);

    }

    public char posicion() {
        char letra = ' ';
        letra = arrayDNI[resto];
        return letra;
    }

}
