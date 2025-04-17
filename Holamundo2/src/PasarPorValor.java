public class PasarPorValor {
    public static void main(String[] args) {

        int i = 10;

        System.out.println("inicar el metodo main con i = " + i);
        /// cuando se invoca el metodo se pone el nombre y la variable que se esta utilzando
        test(i);
        System.out.println("Finaliza el metodo main con el valor de i (se mantiene igual) = " + i);

    }

    /// al inicializar el metodo se debe poner la variable que se esta recibiendo
    public static void test(int i){
        System.out.println("Iniciamos el metodo test con i = " + i);
        i = 35;
        System.out.println("Finaliza el metodo test con i = " + i);

    }
}
