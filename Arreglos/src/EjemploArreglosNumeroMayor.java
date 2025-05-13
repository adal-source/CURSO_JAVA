import java.util.Scanner;

public class EjemploArreglosNumeroMayor {
    public static void main(String[] args) {

        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese 5 numeros enteros");
        for (int i = 0; i < a.length ; i++){
            a[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 1; i < a.length ; i++){
            /// se compara el numero maximo con el siguiente numero
            /// donde se predunta con "?" si se cumple entonces adquiere dicho valor
            max = (a[max] > a[i])? max: i;

        }
        System.out.println("el mayor = " + a[max]);
    }
}
