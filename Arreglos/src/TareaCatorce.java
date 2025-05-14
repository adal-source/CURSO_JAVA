import java.util.Scanner;

public class TareaCatorce {
    public static void main(String[] args) {

        int[] a = new int[7];
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese 7 numeros enteros (entre 11 al 99)");
        for (int i = 0; i < a.length ; i++){
            a[i] = sc.nextInt();
        }

        int max = 0;

        for (int i = 1; i < a.length ; i++){
            if (a[i] <= 11 && a[i] >= 99){
                max = (a[max] > a[i])? max: i;
            }else{
                System.out.println("los nuemros deben de estar entre el rango 11 al 99");
                System.exit(-1);
            }
        }
        System.out.println("el mayor = " + a[max]);
    }
}
