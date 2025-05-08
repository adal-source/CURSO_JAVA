public class EjemploClassMath {
    public static void main(String[] args) {

        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);

        /// calcula el valor maximo entre los valores que se ponen
        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);

        /// calcula el valor maximo entre los valores que se ponen
        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);

        /// redondea el valor subiendo al siguiente numero entero
        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);

        /// redondea el valor bajando al siguiente numero entero
        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);

        /// redondea el valor subiendo al siguiente numero entero
        long entero = Math.round(3.5);
        System.out.println("entero = " + entero);

        ///  la base del exponente es 2.7
        double exp = Math.exp(1);
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("log = " + log);

        /// con el pow se multiplica el pimer valor el numero de veces del segundo
        double potencia = Math.pow(10, 3);
        System.out.println("potencia = " + potencia);

        /// significa raiz cuadrada
        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        double grados = Math.toDegrees(1.57);
        System.out.println("grados = " + grados);

        double radianes = Math.toRadians(grados);
        System.out.println("radianes = " + radianes);

        System.out.println("sin(98): " + Math.sin(radianes));
        System.out.println("cos(98): " + Math.cos(radianes));
    }
}
