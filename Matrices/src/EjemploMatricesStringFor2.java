public class EjemploMatricesStringFor2 {
    public static void main(String[] args) {

        String[][] nombres = {{"pepe", "pepa"},
                {"josefa", "paco"},{"lucas", "pancha"}};

        System.out.println("***** USADNO FOREACH ******");
        for (String[] fila: nombres){
            for (String nombre: fila){
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }
    }
}
