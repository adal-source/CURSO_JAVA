import java.util.Scanner;

public class TareaDiezsies {
    public static void main(String[] args) {

        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        int numero = 0, ocurrencias = 0;

        for (int i = 0; i < a.length; i++){
            System.out.print("ingrese un numero (del 1 al 9): ");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length -1; i++){
            if (a[i] == a[i+1]){
                numero = a[i];
                ocurrencias++;
            }
        }
        System.out.println("La mayor ocurrencias es = " + ocurrencias);
        System.out.println("El elemento que mas se repite es = " + numero);
    }
}
