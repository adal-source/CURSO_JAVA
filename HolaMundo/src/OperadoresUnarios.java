public class OperadoresUnarios {
    public static void main(String[] args) {
        int i = -5;
        int j= +i;
        /// lo que hace es multiplicarlo por 1 ya que se indica que es positivo
        /// j = (1)*i = -5
        System.out.println("j = " + j);

        int k = -i;
        /// lo que hace es multiplicarlo por -1 ya que se indica que es negativo
        /// k= (-1)*i =5
        System.out.println("k = " + k);
    }
}
