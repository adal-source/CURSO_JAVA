import java.util.Scanner;

public class TareaTrece {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++){
            System.out.print("ingrese un numero: ");
            numeros[i] = sc.nextInt();
        }

        int aux = 0;
        for (int i = 0; i < numeros.length - i; i++){
            //System.out.println(numeros[i] + " " + numeros[numeros.length -1 -i]);
            //System.out.println(numeros[numeros.length -1 -i]);
            a[aux++] = numeros[i];
            a[aux++] = numeros[numeros.length -1 -i];
        }

        for (int i = 0; i < a.length ; i++){
            System.out.println("a = " + a[i]);

        }
    }
}
