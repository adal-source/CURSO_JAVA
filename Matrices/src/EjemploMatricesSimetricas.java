public class EjemploMatricesSimetricas {
    public static void main(String[] args) {

        boolean simetrica = true;
        int[][] matriz = {
                {1,2,3,4},
                {2,1,0,5},
                {3,0,1,6},
                {4,5,6,7}
        };

        int i = 0, j;
        /// al inicializarlo con true se asegura que se ejecuata el codigo
        /// por lo menos una vez, tambien se puede usar etiqutas
        //salir: while (i < matriz.length)
        while (i < matriz.length && simetrica == true){
            j = 0;
            //while (j < i)
            while (j < i && simetrica == true){
                /// al hacer el recorrido se invierte la posicion comparada
            /// esto es por que la posicion 0,1 se compara con la posicion 1,0
                if (matriz[i][j] != matriz[j][i]) {// la traspuesta
                    simetrica = false;
                    // break salir;
                }
                j++;
            }
            i++;
        }

        if (simetrica){
            System.out.println("la matriz es simetrica");
        }else {
            System.out.println("l amatriz no es simetrica");
        }
    }
}
