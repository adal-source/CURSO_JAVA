import java.util.Scanner;

public class Seccion10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la radio de un circulo");
        double r = sc.nextDouble();
        double area = Math.PI * Math.pow(r, 2);
        System.out.println("area = " + area);
    }
}
