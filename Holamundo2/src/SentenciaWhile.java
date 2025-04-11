public class SentenciaWhile {
    public static void main(String[] args) {

        int i = 0;
        while(i < 5){
            System.out.println("i = " + i);
            i++;
            /// de incrementar la iteracion puestoo que no lo hace en automatico
            /// como lo es for
        }

        i = 0;
        boolean prueba = true;

        while (prueba){
            if (i == 7){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }
        prueba = false;
        while(prueba){
            System.out.println("nunca se ejecuta");
        }
        /// en cambio en do - while lo hace una sola vez
        do {
            System.out.println("Se ejecuta al menos una vez");
        } while (prueba);
    }
}
