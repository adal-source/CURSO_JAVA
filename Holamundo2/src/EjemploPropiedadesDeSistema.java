import java.util.Properties;

public class EjemploPropiedadesDeSistema {
    public static void main(String[] args) {

        /// como indica el nombre lanza como resultado el nombre de la cuenta anfitrion => username = testp
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        /// pone la direccion en la que aparece en el explorador de archivos => home = C:\Users\testp
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        String java = System.getProperty("user.version");
        System.out.println("java = " + java);

        String lineSeparador = System.getProperty("line.separator");
        String lineSeparador2 = System.lineSeparator();
        System.out.println("lineSeparador: " + lineSeparador2 + "Una linea nueva");

        Properties pt = System.getProperties();
        pt.list(System.out);
    }
}
