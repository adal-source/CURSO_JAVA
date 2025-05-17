import java.util.Scanner;

public class TareaDiezNueve {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero para formar la x");
        int numero = sc.nextInt();

        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                /// imprimiendo solo la primera columna, la mitad de todo
                /// hasta el final y cuando es menos de la mitad
                if (j == 0 || i == numero / 2 || (j == numero - 1
                        && i > numero / 2)) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
