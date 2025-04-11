public class PrecedenciaOperadores {
    public static void main(String[] args) {
        int i = 14;
        int j = 8;
        int k = 20;

        double promedio = i + j + (k / 3d);
        System.out.println("promedio = " + promedio);

        /// en la prioridad entre division y multi
        /// primero se divide k/3 y el resultado se multiplica por 10
        /// por ultimo se hace la suma del resto de la operacion
        promedio = i + j + k / 3d * 10;
        System.out.println("promedio = " + promedio);

        promedio = ++i + j-- + k / 3d * 10;
        System.out.println("promedio = " + promedio);
    }
}
