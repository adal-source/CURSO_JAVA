public class EjemploMtricesBuscar {
    public static void main(String[] args) {

        int [][] matrizEnteros = {
                {35, 98, 3, 1978},
                {15, 2020, 10 , 5},
                {677, 127, 32767, 1999},
        };

        int elementoBuscar = 5;
        boolean encontrado = false;
        int i;
        int j = 0;

        /// al darle un nombre al for se puede detener la busqueda con el break
        buscar: for (i = 0; i < matrizEnteros.length ; i++){
            for (j = 0; j < matrizEnteros[i].length ; j++){
                if (matrizEnteros[i][j] == elementoBuscar){
                    encontrado = true;
                    break buscar;
                }
            }
        }
        if (encontrado){
            System.out.println("Encontrado "+ elementoBuscar + " en las coordenadas " + i + "," + j);
        } else {
            System.out.println("no se encontro en la matriz");

        }
    }
}
