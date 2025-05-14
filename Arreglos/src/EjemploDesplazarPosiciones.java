import java.util.Scanner;

public class EjemploDesplazarPosiciones {
    public static void main(String[] args) {

        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        int ultimo = 0;

        for (int i = 0; i < a.length ; i++){
            System.out.print("ingrese un numero: ");
            a[i] = sc.nextInt();
        }
        /// se respalda el ultimo valor para que no se pierda
        ultimo = a[a.length -1];
        /// se desplazan todos los valores una posicion hacia adelante
        /// con ello se pierde el ultimo valor pero ya se enuentra guardado
        for (int i = a.length -2; i >= 0; i--){
            /// se pasa el valor anterior a la sicuiente posicion
            a[i+1] = a[i];

        }
        a[0] = ultimo;
        System.out.println("el arreglo: ");
        for (int i = 0; i < a.length ; i++ ){
            System.out.println(a[i]);

        }
    }
}
