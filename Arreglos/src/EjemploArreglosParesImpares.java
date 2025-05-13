import java.util.Scanner;

public class EjemploArreglosParesImpares {
    public static void main(String[] args) {

        int[] a,pares,impares;
        int totalPares = 0,totalImpares = 0;
        a = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese los 10 numeros enteros");
        for (int i = 0; i < a.length ; i++){
            a[i] = sc.nextInt();

        }

        for (int i = 0; i < a.length ; i++){
            /// en cada posicion se pregunta si la division es 0
            if (a[i]%2 == 0){
                /// se agrega a la variable inicializada
                totalPares++;

            } else {
                /// se agrega a la variable inicializada
                totalImpares++;

            }
        }
        pares = new int[totalPares];
        impares = new int[totalImpares];

        int j = 0, k = 0;
        for (int i = 0; i < a.length ; i++){
            if (a[i] % 2 == 0){
                /// se agrega a la variable inicializada
                pares[j++] = a[i];

            } else {
                /// se agrega a la variable inicializada
                impares[k++] = a[i];

            }
        }
        System.out.println("pares");
        for (int i = 0; i < pares.length ; i++){
            System.out.print(pares[i] + ", ");

        }

        System.out.println("\r\n impares");
        for (int i = 0; i < impares.length ; i++){
            System.out.print(impares[i] +  ", ");

        }
    }
}
