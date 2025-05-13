import java.util.Scanner;

public class EjemploArreglosDetectarOrden {
    public static void main(String[] args) {

        int[] a = new int[7];
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese 7 numeros");


        for (int i = 0; i < a.length ; i++){
            a[i] = sc.nextInt();
        }

        boolean ascendente = false; //bandera 1
        boolean descendente = false;//bandera 2
        for (int i = 0; i < a.length -1 ; i++){
            if (a[i] > a[i+1]){
                descendente = true;

            }
            if (a[i] < a[i+1]){
                ascendente = true;

            }

        }

        if (ascendente == true &&  descendente == true){
            System.out.println("Arreglo = desordenado");

        } else if (ascendente == true &&  descendente == false) {
            System.out.println("Arreglo = oreden de forma ascendente");

        }else if (ascendente == false &&  descendente == true) {
            System.out.println("Arreglo =  oreden de forma descendente");

        }else if (ascendente == false &&  descendente == false) {
            System.out.println("Arreglo = todos son iguales");

        }
    }
}
