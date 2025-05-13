public class EjemploArreglosOrdenPrincipioFinal {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        int[] a = new int[10];

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = i + 1;

        }

        int aux = 0;
        for (int i = 0; i < numeros.length - i; i++){
            //System.out.println(numeros[i] + " " + numeros[numeros.length -1 -i]);
            //System.out.println(numeros[numeros.length -1 -i]);
            /// de este modo se pone en la posicion 0 el valor 1 y la posicion 1 el valor 10
            a[aux++] = numeros[i];
            /// con esto se llena todo el arreglo
            a[aux++] = numeros[numeros.length -1 -i];
        }

        for (int i = 0; i < a.length ; i++){
            System.out.println("a = " + a[i]);

        }
    }
}
