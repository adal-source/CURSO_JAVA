public class EjemploMetodoGetClass {
    public static void main(String[] args) {

        String texto = "hola mundo";

        Class strClass = texto.getClass();

        System.out.println("strClass = " + strClass.getName());
        System.out.println("strClass = " + strClass.getSimpleName());
        System.out.println("strClass = " + strClass.getPackageName());
    }
}
