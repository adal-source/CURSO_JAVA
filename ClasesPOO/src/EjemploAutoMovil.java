public class EjemploAutoMovil {
    public static void main(String[] args) {
        /// funciones que porcesan datos

        /// clase            constructor
        AutoMovil auto = new AutoMovil();
        auto.fabricante = "impresa";
        auto.modelo = "subaru";
        auto.color = "blanco";
        auto.cilindrada = 2.0;

        AutoMovil mazda = new AutoMovil();
        mazda.fabricante = "mazda";
        mazda.modelo = "bt-50";
        mazda.color = "rojo";
        mazda.cilindrada = 3.0;

        System.out.println("auto.fabricante = " + auto.fabricante);
        System.out.println("auto.modelo = " + auto.modelo);
        System.out.println("auto.color = " + auto.color);
        System.out.println("auto.cilindrada = " + auto.cilindrada);

        System.out.println("mazda.fabricante = " + mazda.fabricante);
        System.out.println("mazda.modelo = " + mazda.modelo);
        System.out.println("mazda.color = " + mazda.color);
        System.out.println("mazda.cilindrada = " + mazda.cilindrada);
    }
}
