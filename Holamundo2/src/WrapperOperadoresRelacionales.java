public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {

        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("son el mismo object? = " + (num1 == num2));

        num2 = 1000;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
            /// se evalua si es la misma instancia no el mismo valor por ello sale false
        System.out.println("son el mismo object? = " + (num1 == num2));
        System.out.println("tienen el mismo valor?  = " + (num2.equals(num1)));
        System.out.println("tienen el mismo valor con char? = " + (num1.intValue() == num2.intValue()));
    }
}
