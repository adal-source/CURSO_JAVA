import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {

        String texto = "hola mundo";

        Class strClass = texto.getClass();

        System.out.println("strClass = " + strClass.getName());
        System.out.println("strClass = " + strClass.getSimpleName());
        System.out.println("strClass = " + strClass.getPackageName());

        /// Con la clase Metodo se puede mostrar lo que llega a utilizar la variable que se pone
        for (Method metodo: strClass.getMethods()){
            System.out.println("metodo = " + metodo.getName());

        }

        Integer num = 34;

        /// se muestra el metodo padre con el super class
        Class intClass = num.getClass();
        Class objClass = intClass.getSuperclass().getSuperclass();
        //System.out.println("intClass.getName() = " + intClass.getName());
        //System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass());    
        System.out.println("intClass.getSuperclass().getSuperclass() = " + intClass.getSuperclass().getSuperclass());

        for (Method metodo: objClass.getMethods()){
            System.out.println("metodo = " + metodo.getName());

        }
    }
}
