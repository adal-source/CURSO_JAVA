import java.util.Scanner;

public class EjemploEliminarPosicion {
    public static void main(String[] args) {

        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++){
            System.out.print("ingrese un numero: ");
            a[i] = sc.nextInt();
        }

        System.out.print("\r\n Ingrese la posicion a eliminar: ");
        int posicion = sc.nextInt();
        for (int i = posicion; i < a.length -1; i++){
            a[i] = a[i+1];
        }

        /// al conocer cuantos se eliminan se pone el -1
        int[] b = new int[a.length -1];
        /// de este modo se copia todo el array al b indicando
        /// el inicio de "a" y el inidio de "b"
        System.arraycopy(a,0, b,0, b.length);

        System.out.println("el arreglo: ");
        for (int i = 0; i < b.length ; i++ ){
            System.out.println( i + " => " +b[i]);

        }
    }
}
