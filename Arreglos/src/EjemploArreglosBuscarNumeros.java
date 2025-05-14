import java.util.Scanner;

public class EjemploArreglosBuscarNumeros {
    public static void main(String[] args) {

        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length  ; i++){
            System.out.print("ingrese un numero: ");
            a[i] = sc.nextInt();
        }
        System.out.println("\r\n Ingrese un numero a buscar: ");
        int num = sc.nextInt();
        int i = 0;
        /// se va a iterar mientras que se encuentre dentro del arreglo
        /// y las veces mientras sea distinto de la poscion que se busca
        while (i < a.length && a[i] != num){
            i++;
        }
        // for(; i < a.length && a[i] != num ; i++){}
        /// si es la misma longitud que a[] entonces no se encontro el numero osea "10"
        if (i == a.length){
            System.out.println("Numero no encontrado");

        } else if (a[i] == num) {
            System.out.println("Encontrado en la posicion: " + i);
        }

        String[] st = new String[4];
        for (int j = 0; j < st.length  ; j++){
            System.out.print("ingrese un string: ");
            st[j] = sc.next();
        }
        System.out.println("\r\n Ingrese un string a buscar: ");
        String nombre = sc.next();
        int j = 0;
        while (j < st.length && !st[j].equalsIgnoreCase(nombre)){
            j++;
        }
        if (j == st.length){
            System.out.println("Palabra no encontrada");

        } else if (st[j].toLowerCase().compareTo(nombre.toLowerCase()) == 0) {
            System.out.println("Encontrado en la posicion: " + j);
        }
    }
}
