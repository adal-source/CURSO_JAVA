public class SentenciaBucleEtiquetas {
    public static void main(String[] args) {

        /// con esto se puede anidar for, con el uso de una etiqueta
        bucle1:
        for (int i  = 0; i < 5; i++) {

            /// con el bucle lo que hace es con cada iteracion de "i" hace
            /// un recorrido completo la "j" por lo cual
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue bucle1;
                }
                /// el resultado se es pera como
                /// i = 0, j = 0; i = 0, j = 1; i = 0, j = 2 ...
                //System.out.println("i = " + i + ", j = " + j);

                /// [i = 0, j = 0], [i = 0, j = 1], [i = 0, j = 2], [i = 0, j = 3], [i = 0, j = 4],
                System.out.print("[i = " + i + ", j = " + j + "], ");
            }
        }
    }
}
