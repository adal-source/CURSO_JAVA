public class OperadoresIncrementales {
    public static void main(String[] args) {
        int i=1;
        /// se indica se que sume 1 a la variable i antes de mostrar la variable
        int j = ++i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        /// pos-incremento

        i=2;
        /// es importante tomar en cuenta cuando se muestra la variableS
        System.out.println("valor inicial de  i = " + i);
        /// primero muestra el numero como esta la variable originalmente
        /// despues se hace el incremento que se poneS
        j=i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        /// lo mismo sucede con el decremento
        i=2;
        System.out.println("valor inicial de  i = " + i);
        j=i--;
        System.out.println("i = " + i);
        System.out.println("j=i-- = " + j);

        i=3;
        System.out.println("valor inicial de  i = " + i);
        j=--i;
        System.out.println("i = " + i);
        System.out.println("j=--i = " + j);

        System.out.println("con el incremento en el println ++j = " + (++j));
        System.out.println("con el incremento en el println i++ = " + (i++));
    }
}
