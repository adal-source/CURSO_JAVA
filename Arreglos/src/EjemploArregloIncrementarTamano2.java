import java.util.Scanner;

public class EjemploArregloIncrementarTamano2 {
    public static void main(String[] args) {

        int[] a = new int[7];
        Scanner sc = new Scanner(System.in);
        int numero, posicion, ultimo;

        for (int i = 0; i < a.length; i++){
            System.out.print("ingrese un numero: ");
            a[i] = sc.nextInt();
        }

        System.out.print("\r\n Ingrese el nuevo numero: ");
         numero = sc.nextInt();
         posicion = 0;
         ultimo = a[a.length -1];
        while (posicion < 6 && numero > a[posicion]){
            posicion++;

        }

        for (int i = a.length -2; i >= posicion; i--){
            a[i+1] = a[i];

        }

        int[] b = new int[a.length +1];
        System.arraycopy(a, 0, b, 0, a.length);

        if (numero > ultimo){
            b[b.length -1] = numero;

        }else {
            b[b.length -1] = ultimo;
            b[posicion] = numero;

        }

        System.out.println("el arreglo: ");
        for (int i = 0; i < b.length ; i++ ){
            System.out.println(i + " => " + b[i]);

        }
    }
}
