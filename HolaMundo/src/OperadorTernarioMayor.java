import java.util.Scanner;

public class OperadorTernarioMayor {
    public static void main(String[] args) {

        int max = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite un numero2: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite un numero3: ");
        int num3 = scanner.nextInt();

        /// se hace la comparacion en la cual si el numero mayor pasara a la siguiente comparacion

        max = (num1 > num2) ? num1 : num2;
        max = (max > num3) ? max : num3;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("el numero mayor es = " + max);
    }
}
