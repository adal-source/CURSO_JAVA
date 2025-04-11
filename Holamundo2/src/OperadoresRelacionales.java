public class OperadoresRelacionales {
    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        float k = 127e7f;
        double l = 2.1413e3;
        boolean m = false;

        boolean b1 = i == j;
        System.out.println("b1 = " + b1);

        /// al poner ! al inicio de la variable se esta negando el resultado en cuestion de
        /// la variables booleanes
        boolean b2 = !b1;
        System.out.println("b2 = " + b2);

        /// se indica si es indiferente entre i, j
        boolean b3 = i != j;
        System.out.println("b3 = " + b3);

        /// de igual manera se pude hacer con las demas signos como son i<j
        /// de igual manera se pude hacer con <= ó >=

        boolean b4 = i < j;
        System.out.println("b4 = " + b4);

        boolean b5 = i > j;
        System.out.println("b4 = " + b5);
    }
}
