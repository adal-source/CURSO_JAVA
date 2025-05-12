import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {
    public static void arregloInverso(String[] arreglo){
        int total = arreglo.length;
        int total2 = arreglo.length;
        for (int i = 0; i < total2; i++){
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
            total2--;
        }
    }

    public static void main(String[] args) {

        String[] productos = {"Kingston","Samsung","SSD"
                ,"Asus","Macbook","Chrome","Bicicletas"};
        int total = productos.length;

        /// implementacion con API de JDK de Java
        Arrays.sort(productos);
        Collections.reverse(Arrays.asList(productos));//esta es la forma
        //arregloInverso(productos);

        /// al convertirlo en un metodo es inescenario tener dos for
        System.out.println("***** USANDO FOR *****");
        for (int i = 0; i < total; i++){
            System.out.println("para el indice "+ i +" es el productos = " + productos[i]);

        }
    }
}
