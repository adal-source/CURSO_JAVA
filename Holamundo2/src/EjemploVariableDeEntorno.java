import java.util.Map;

public class EjemploVariableDeEntorno {
    public static void main(String[] args) {

        /// se va a ocupar System.getenv()
        /// en CMD - comando para crear un PATH, setx SALUDAR_HOLA "Hola amigos, que tal"
        /// para mejorar la limpiez de variables en el codigo, codigo basura
        // se manda a llamar el recolector de basura en cualquier parte del codigo
        // System.gc();
        /// para salir del programa de forma exitosa cuando es indiferente de 0 es porque hubo un error
        //System.exit(0);

        Map<String, String> varEnv = System.getenv();
        System.out.println("Variables de ambiente del sistema = " + varEnv);

        System.out.println("<-------------- Listando variables de entorno del sistema ---------------->");

        for (String key: varEnv.keySet()){
            System.out.println("key + => + varEnv.get(key) = " + key + " => " + varEnv.get(key));
            
        }

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir);

        String path = System.getenv("PATH"); // o Path
        System.out.println("path = " + path);

        String path2 = varEnv.get("Path");  // se de poner tal y como se muestra en el mapa siendo que es mas estricto que del otro modo
        System.out.println("path2 = " + path2);

    }
}
