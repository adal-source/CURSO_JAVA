import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {

        Date fecha = new Date();
        System.out.println("fecha = " + fecha);

        /// se da dormato se declara la manera uno lo quiere poner en este caso un fomato conocido,
        /// sin que se ponga otras letras mas que las asignadas para la fecha
        SimpleDateFormat df = new SimpleDateFormat("dd MMMM, yyyy");
        //SimpleDateFormat df = new SimpleDateFormat("dd MMMM yyyy");
        /// la G es para indicar el año d.c ó a.c
        /// h para hora, m para minutos y s para segundos, z para la zona horaria
        /// se agrega el texto con ''
        /// se pone el dia de la sema con E y con EE para EEEE
        //SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        String fechaStr = df.format(fecha);

        long j = 0;
        for (int i = 0; i < 100000000; i++){
            j += i;

        }
        System.out.println("j = " + j);

        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("tiempo trasncurrido en el for = " + tiempoFinal);
        System.out.println("fechaStr = " + fechaStr);
    }
}
