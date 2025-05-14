import java.util.Scanner;

public class EjemploDesplazarPosiciones2 {
    public static void main(String[] args) {

        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length -1; i++){
            System.out.print("ingrese un numero: ");
            a[i] = sc.nextInt();
        }

        System.out.print("\r\n Ingrese el nuevo numero: ");
        int elemento = sc.nextInt();
        System.out.print("\r\n Ingrese la posicion (del 0 al 9): ");
        int posicion = sc.nextInt();

        /// se pone la poscion ya que en ese lugar se pondra el numero
        /// donde se pregunta si i es mayor igual a la posicion ingresada
        for (int i = a.length -2; i >= posicion; i--){
            a[i+1] = a[i];

        }
        a[posicion] = elemento;

        System.out.println("el arreglo: ");
        for (int i = 0; i < a.length ; i++ ){
            System.out.println(a[i]);

        }
    }
}
