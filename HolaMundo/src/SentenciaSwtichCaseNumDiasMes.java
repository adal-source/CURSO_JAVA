import java.util.Scanner;

public class SentenciaSwtichCaseNumDiasMes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingres el numero del mes 1 - 12");
        int mes = sc.nextInt();
        int numeroDias = 0;
        //int year = 0;
        System.out.println("Ingrese el año YYYY");
        int year = sc.nextInt();

        switch (mes) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            numeroDias = 31;
            System.out.println("El mes tiene de dias es: " + numeroDias);
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            numeroDias = 30;
            System.out.println("El mes tiene de dias es: " + numeroDias);
            break;
        case 2:
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                numeroDias = 29;
                System.out.println("El mes tiene de dias es: " + numeroDias);
            }else {
                numeroDias = 28;
                System.out.println("El mes tiene de dias es: " + numeroDias);

            }
            break;
        default:
            System.out.println("la informacion ingresa es incorrecta");
            break;
        }

    }
}
