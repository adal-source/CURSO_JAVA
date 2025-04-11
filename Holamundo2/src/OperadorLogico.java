public class OperadorLogico {
    public static void main(String[] args) {
        int i = 3;
        byte j = 3; //7
        float k = 127e-7f; //127e7f
        double l = 2.1413e3;
        boolean m = false;

        /// si i es igual a j ademas de que k es menor a l, ademas que m sea falso
        /// el primero no se cumple por lo que todo lo demas se descarta
        /// ya que si el primero es falso, el resultado sera falsoS
        boolean b1 = i == j && k < l && m == false;
        System.out.println("b1 = " + b1);

        /// se indica que si i es igual a j, ó, si k es menor a l
        /// por lo que el resultado sera true ya se cumple la segunda condicional
        boolean b2 = i == j || k < l;
        System.out.println("b2 = " + b2);

        /// sin importar la segda declaracion sera falsa si la primera lo es
        boolean b3 = i == j && (k < l || m == true);
        System.out.println("b3 = " + b3);

        /// se hace la revision ya que si uno es verdadero el resultado serfaverdadero
        boolean b4 = i == j || (k < l && m == true);
        System.out.println("b4 = " + b4);
    }
}
