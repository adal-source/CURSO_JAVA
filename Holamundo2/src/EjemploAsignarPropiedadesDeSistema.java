import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {

        try {
            /// tanto File como properties piden en este caso el try-catch
            FileInputStream archivo = new FileInputStream("src/config.propeties");

            Properties pt = new Properties(System.getProperties());
            /// se carga el archivo que s ecreo
            pt.load(archivo);
            /// se pone un nombre con cual lo logremos a identificar
            pt.setProperty("mi.propiedad.personalizada","-mi valor guardado en el objecto properties");
            /// aqui se pasa la informacion de la ubicacion en Properties
            System.setProperties(pt);

            /// estas propiedades es ponerlo en el codigo en lugar de hacer un archivo a parte
            Properties ps = System.getProperties();
            System.out.println("ps.getProperty(...) = " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("config.texto.ambiente"));
            System.out.println(System.getProperty("config.autor.nombre"));

            /// se manda a imprimir las propiedades y se pone en lista con la siguiente linea
            //System.setProperties(pt);
            System.getProperties().list(System.out);

            /// esta es otra formal de ponerlo
            /*
            *
            Properties ps = System.getProperties();
            ps.list(System.out);
            *
            * */
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            /// se puede poner err en luagr de out, esto es para que el error resalte de colo rojo
            System.out.println("no existe el archivo = " + e);
            // System.exit(1);
            ///en caso de una falla se vuelve a iniciar el programa
            // main(args);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
