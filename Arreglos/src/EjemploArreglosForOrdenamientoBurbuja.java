public class EjemploArreglosForOrdenamientoBurbuja {
    public static void sortBurbuja(Object[] arreglo){
        int contador = 0;

        for (int i = 0; i < arreglo.length - 1; i++){
            for (int j = 0; j < arreglo.length -1 -i; j++){
                /// para hacer el cambio acendente a decendente se pone ">"
                if ( ((Comparable)arreglo[j+1]).compareTo(arreglo[j]) < 0){
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
                contador ++;
            }
        }
        System.out.println("contador = " + contador);

    }

    public static void main(String[] args) {

        String[] productos = {"Kingston","Samsung","SSD"
                ,"Asus","Macbook","Chrome","Bicicletas"};
        int total = productos.length;

        /// es el metodo burbuja. sin embar al ser un codigo sencillo
        /// hace operaciones inecesarias
        int contador = 0;
        /*for (int i = 0; i < total; i++){
            for (int j = 0; j < total; j++){
                if (productos[i].compareTo(productos[j]) < 0){
                    /// se pone de esta manera para que no se confunda el algoritmo
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxiliar;
                }
                contador ++;// 49 veces
            }
        }
        ***********************************************
        //(int i = 0; i < total; i++)
        for (int i = 0; i < total - 1; i++){
            //(int j = 0; j < total-1; j++)
            for (int j = 0; j < total -1 -i; j++){
                /// comparando con el elemento actual con el siguinte y lo ordena
                if (productos[j+1].compareTo(productos[j]) < 0){
                    /// se pone de esta manera para que no se confunda el algoritmo
                    String auxiliar = productos[j];
                    productos[j] = productos[j+1];
                    productos[j+1] = auxiliar;
                }
                contador ++;// 42 veces => 21 veces
            }
        }
        System.out.println("contador = " + contador);
        */
        sortBurbuja(productos);
        for (int i = 0; i < total; i++){
            System.out.println("para el indice "+ i +" es el productos = " + productos[i]);

        }

        Integer[] numeros = new Integer[7];
        numeros[0] = 10;
        numeros[1] = 7;
        numeros[2] = 35;
        numeros[3] = 53;
        numeros[4] = -1;
        numeros[5] = 0;
        numeros[6] = -69;

         contador = 0;
        /*
         for (int i = 0; i < numeros.length - 1; i++){
            for (int j = 0; j < numeros.length -1 -i; j++){
                if ( ((Integer)numeros[j+1]).compareTo(numeros[j]) < 0){
                    int auxiliar = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = auxiliar;
                }
                contador ++;// 42 veces => 21 veces
            }
        }
        System.out.println("contador = " + contador);
        */
        sortBurbuja(numeros);
        for (int i = 0; i < numeros.length; i++){
            System.out.println("para el indice "+ i +" el numero es = " + numeros[i]);

        }
    }
}
