public class SentenciaBucleEtiquetaBuscar {
    public static void main(String[] args) {

        String frase = "tres tristes triges tragan trigo en un trigal";
        String palabra = "trigo";
        int max = frase.length();

        int maxFrase = frase.length();
        int maxPalabra = palabra.length();


        int cantidad = 0;
        char letra = 't';
         /*
        for (int i = 0; i < max; i++) {

            /// de esta manera se busca un caracter en la variable String de muestra
            if (frase.charAt(i) != letra) {

                /// cuando se encunetra el caracter, se sigue con lo demas de la frase
                continue;
            }
            cantidad++;
        }
        System.out.println("encontrado = " + cantidad + " veces el caracter 't' en la frase");
        */
        // /*
        buscar:
        /// la "i" recorre toda la frase   
        for (int i = 0; i < maxFrase; i++) {
            int k = i;
            /// lo que hace "j" es recore palabra por palabra y empieza acomparar
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    continue buscar;
                }
            }
            cantidad++;
        }
        System.out.println("encontrado = " + cantidad + " veces la palabra '"+ palabra +"' en la frase");
        // */
    }
}

