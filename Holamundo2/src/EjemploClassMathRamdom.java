public class EjemploClassMathRamdom {
    public static void main(String[] args) {

        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};
        /// se forma predilecta el systema escoge el rango entre 0 y 1 donde ambos
        /// estan excludios
        double random = Math.random();
        System.out.println("random = " + random);
        random *= colores.length;

        System.out.println("random = " + random);

        /// se pone el de abajo para que no salte un error que el arreglo se desborde
        /// ya que en el indice son 6 pero id solo llega 5
        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("color aleatorio es = " + colores[(int) random]);
    }
}
