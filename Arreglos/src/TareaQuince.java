import java.util.Scanner;

public class TareaQuince {
    public static void main(String[] args) {

        int[] a = new int[7];
        Scanner sc = new Scanner(System.in);
        double promedioPositivo = 0, promedioNegativo = 0;
        int Positivo = 0, Negativo = 0, contadorCeros = 0;

        for (int i = 0; i < a.length; i++){
            System.out.print("ingrese un numero: ");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++){
            if (a[i] > 0){
                promedioPositivo += a[i];
                Positivo++;
            } else if (a[i] < 0) {
                promedioNegativo += a[i];
                Negativo++;
            }else {
                contadorCeros++;
            }
        }

        System.out.println("promedioPositivo = " + (promedioPositivo/Positivo));
        System.out.println("promedioNegativo = " + (promedioNegativo/Negativo));
        System.out.println("contadorCeros = " + contadorCeros);
    }
}
