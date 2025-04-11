public class OperadorInstanceOff {
    public static void main(String[] args) {

        String texto = new String("Hola Mundo");

        Integer num = 7;

        /// se hace un chequeo si la variable texto es del tipo String
        boolean b1 = texto instanceof String;
        /// se imprime el resultado donde comfirmando lo anterior
        System.out.println("la variable texto es del tipo String = " + b1);

        b1 = num instanceof Integer;
        System.out.println("la variable texto es del tipo Integer = " + b1);

        /// si pertenece a otro tipo de variable indica el error
        ///por lo cual no dejara que se compile con dicho error
        //b1 = texto instanceof Integer;
        //System.out.println("la variable texto es del tipo Integer = " + b1);

        Number decimal = 45.23;
        System.out.println("la variable texto es del tipo Double = " + decimal);

        b1 = decimal instanceof Double;
        System.out.println("la variable texto es del tipo Double = " + b1);

        /// solo en la version jdk 23 puede aceptar la declaracion de abajo
        //b1 = b1 instanceof Boolean;
        /// se toma el valor de un primitivoS
        Number num2 = Integer.valueOf("7");
    }
}
