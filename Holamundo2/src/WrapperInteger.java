public class WrapperInteger {
    public static void main(String[] args) {

        /// el int es un entero primitivo
        int intPrimitivo = 32767;
        /// tambien puede recibir un pirmitivo entero
        Integer intObjeto = Integer.valueOf(intPrimitivo);
        Integer intObjeto2 = intPrimitivo;
        System.out.println("intObjeto2 = " + intObjeto2);

        /// tambien un entero se puede convertir en un primitivo
        int num = intObjeto;
        System.out.println("num = " + num);
        /// de forma explicita se convierte
        int num2 = intObjeto.intValue();
        System.out.println("num2 = " + num2);

        String valorTvLcd = "6700";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        /// cunado se pasa eñ vañor maximo de short el cual es 32767
        /// el numero se convierte en negativo por que da una "vuelta"
        /// por que deja de tener signo, ya sea + o -
        short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);

        /// el resultado que se impeime es 0 ya que se íerde informacion
        /// puesto que +127 y -128 es su limite que puede alcanzar
        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);
    }
}