import java.util.Scanner;

public class EjemploArregloIncrementarTamano {
    public static void main(String[] args) {

        int[] a = new int[10];
        int elemento, posicion, ultimo;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++){
            System.out.print("ingrese un numero: ");
            a[i] = sc.nextInt();
        }

        System.out.print("\r\n Ingrese el nuevo numero: ");
         elemento = sc.nextInt();
        System.out.print("\r\n Ingrese la posicion (del 0 al 9): ");
         posicion = sc.nextInt();

         ultimo = a[a.length-1];
        for (int i = a.length -2; i >= posicion; i--){
            a[i+1] = a[i];

        }
        int[] b = new int[a.length +1];
        System.arraycopy(a, 0, b, 0, a.length);
        b[posicion] = elemento;
        b[b.length -1] = ultimo;

        System.out.println("el arreglo: ");
        for (int i = 0; i < b.length ; i++ ){
            System.out.println(i + " => " + b[i]);

        }
    }
}
