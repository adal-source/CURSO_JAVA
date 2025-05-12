import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

        /// intansiacion del arreglo con limite pero siendo dinamica
        //String[] productos = new String[7];
        /// se crea sabiendo la cantidad y los elementos que se asignan
        String[] productos = {"Kingston","Samsung","SSD"
                ,"Asus","Macbook","Chrome","Bicicletas"};
        int total = productos.length;

        /*
        System.out.println("***** USANDO FOR *****");
        productos[0] = "Kingston";
        productos[1] = "Samsung";
        productos[2] = "SSD";
        productos[3] = "Asus";
        productos[4] = "Macbook";
        productos[5] = "Chrome";
        productos[6] = "Bicicletas";
        */

        /// el array es un arreglo y el sort lo ordena de la A a la Z
        Arrays.sort(productos);

        System.out.println("***** USANDO FOR *****");
        for (int i = 0; i < total; i++){
            System.out.println("para el indice "+ i +" es el productos = " + productos[i]);

        }

        /// se imprime de manera decrementar es decir empieza desde el final
        System.out.println("***** USANDO FOR INVERSO *****");
        for (int i = 0; i < total; i++){
            System.out.println("para i =  "+ (total-1-i) + " valor: "+ productos[total-1-i]);

        }

        System.out.println("***** USANDO FOR INVERSO 2 *****");
        for (int i = total -1; i >= 0; i--){
            System.out.println("para i =  "+ i + " valor: "+ productos[i]);

        }


    }
}
