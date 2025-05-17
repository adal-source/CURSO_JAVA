import java.util.Scanner;

public class TareaDiesOcho {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero para formar la x");
        int numero = sc.nextInt();

        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                /// imprimiendo en digonal y contra diagonal
                if (i == j || i + j == numero - 1) {
                    System.out.print("X");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}
