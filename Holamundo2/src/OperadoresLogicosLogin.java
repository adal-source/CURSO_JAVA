import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        /*String[] usuarios = new String[5];
        String[] passwords = new String[5];
        usuarios[0] = "admin";
        passwords[0] = "12345";
        usuarios[1] = "adal";
        passwords[1] = "12345";*/

        String[] usuarios = {"admin", "adal"};
        String[] passwords ={"12345","1234"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el username: ");
        String usuario = scanner.next();

        System.out.println("Digite el password: ");
        String pass= scanner.next();

        boolean esAutenticado = false;

        for (int i = 0; i < usuarios.length; i++) {
            /// de este modo cuando sea true se corta la busqueda sin necesitar de un break
        /// que lo detenga
            esAutenticado = (usuarios[i].equals(usuario) && pass.equals(pass)?true:esAutenticado);

            /*if (usuarios[i].equals(usuario) && passwords[i].equals(pass)) {

                esAutenticado = true;
                break;
            }*/
        }
        /// al usar al booleano de manera implisita se reduce la cantidad de lineas
        /// ademas de que se vuelve eficiente
        String mensaje = esAutenticado ? "Bienvenido usuario ".concat(usuario).concat("!"):"Lo seentimos,requiere auntenticacion";
        System.out.println("mensaje = " + mensaje);

        /// se obtiene el mismo resultado sin el uso de if
        /*if (esAutenticado) {

            System.out.println("Bienvenido usuario ".concat(usuario).concat("!"));
        } else {
            System.out.println("Lo seentimos,requiere auntenticacion");
        }*/
    }
}
