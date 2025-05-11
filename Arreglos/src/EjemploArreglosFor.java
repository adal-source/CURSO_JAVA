import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        /// intansiacion del arreglo
        int[] numeros = new int[10];
        String[] productos = new String[7];
        int total = productos.length;

        System.out.println("***** USANDO FOR *****");
        productos[0] = "Kingston";
        productos[1] = "Samsung";
        productos[2] = "SSD";
        productos[3] = "Asus";
        productos[4] = "Macbook";
        productos[5] = "Chrome";
        productos[6] = "Bicicletas";

        /// el array es un arreglo y el sort lo ordena de la A a la Z
        Arrays.sort(productos);

        for (int i = 0; i < total; i++){
            System.out.println("para el indice "+ i +" es el productos = " + productos[i]);

        }

        System.out.println("***** USANDO FOREACH *****");
        for (String pord: productos){
            System.out.println("pord = " + pord);

        }

        System.out.println("***** USANDO WHILE *****");
        int i = 0;
        while (i < total){
            System.out.println("para el indice "+ i +" es el productos = " + productos[i]);
            i++;
        }

        System.out.println("***** USANDO DO-WHILE *****");
        int j = 0;
        do {
            System.out.println("para el indice "+ j +" es el productos = " + productos[j]);
            j++;
        }while (i < total);

        int totalNumeros = numeros.length;
        for (int k = 0; k < totalNumeros; k++){
            numeros[k] = k*3;
        }

        for (int k = 0; k < totalNumeros; k++){
            System.out.println("numeros[k] = " + numeros[k]);
        }
    }
}
