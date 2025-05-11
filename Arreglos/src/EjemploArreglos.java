import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        /// intansiacion del arreglo
        int[] numeros = new int[4];
        String[] productos = new String[7];

        /// se inicialiazan con valores cada seccion
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;// se puede hacer un cast (int)xLong;
        numeros[3] = 4;

        /// los valores por defecto son 0 en enteros y
        /// null en String, tambien se puede asignar de manera directa
        productos[0] = "Kingston";
        productos[1] = "Samsung";
        productos[2] = "SSD";
        productos[3] = "Asus";
        productos[4] = "Macbook";
        productos[5] = "Chrome";
        productos[6] = "Bicicletas";

        /// el array es un arreglo y el sort lo ordena de la A a la Z
        Arrays.sort(productos);

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];
        String prod6 = productos[5];
        String prod7 = productos[6];

        System.out.println("productos[0] = " + prod1);
        System.out.println("productos[1] = " + prod2);
        System.out.println("productos[2] = " + prod3);
        System.out.println("productos[3] = " + prod4);
        System.out.println("productos[4] = " + prod5);
        System.out.println("productos[5] = " + prod6);
        System.out.println("productos[6] = " + prod7);
    }
}
