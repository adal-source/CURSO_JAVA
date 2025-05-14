import java.util.Scanner;

public class EjemploDesplazarPosiciones3 {
    public static void main(String[] args) {

        int[] a = new int[7];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length -1; i++){
            System.out.print("ingrese un numero: ");
            a[i] = sc.nextInt();
        }

        System.out.print("\r\n Ingrese el nuevo numero: ");
        int numero = sc.nextInt();
        int posicion = 0;
        /// se ejecuta dentro de las 6 variables posibles
        /// y que este dentro de a por que si no se quedara buscando
        while (posicion < 6 && numero > a[posicion]){
            posicion++;

        }

        for (int i = a.length -2; i >= posicion; i--){
            a[i+1] = a[i];

        }
        a[posicion] = numero;

        System.out.println("el arreglo: ");
        for (int i = 0; i < a.length ; i++ ){
            System.out.println(a[i]);

        }
    }
}
