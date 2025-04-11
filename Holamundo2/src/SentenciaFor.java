public class SentenciaFor {
    public static void main(String[] args) {


        /// cuando la varable esta declarada dentro del for, es una variable interna
        /// cuando esta declarada al inicio o entra parte es una variable global

        for(int i = 0;i <= 5; i++){ /// => (;i <= 5;)

            /*
             if(i <= 5){
                break;
             }
            * */

            System.out.println("i = " + i);

            /// el incremento tambien puede ir en esta parte i++
        }

        //System.out.println("i = " + i);

        for (int i = 1, j = 10; i < j ; i++, j --){
            System.out.println(i + " - " + j);

        }

        for (int i = 1; i <= 10; i++){

            if (i % 2 == 0){
                /// en lugar de finalizar seguira con las demas comparaciones hasta finalzar
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
