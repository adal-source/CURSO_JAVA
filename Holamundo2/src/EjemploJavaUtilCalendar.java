import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        /// se puede colocar el nombre del mes con letras mayusculas, tambien para los dias de la semana
        calendar.set(2020, 0, 25, 19, 20, 10);
        //calendar.set(2020, Calendar.SEPTEMBER, 25, 19, 20, 10);
        /// se puede poner de manera separada de la siguiente manera
        calendar.set(Calendar.YEAR, 2025);
        calendar.set(Calendar.MONTH, Calendar.JULY);
        calendar.set(Calendar.DAY_OF_MONTH, 25);

        //calendar.set(Calendar.HOUR_OF_DAY, 21);
        calendar.set(Calendar.HOUR, 7);
        calendar.set(Calendar.AM_PM, Calendar.PM);
        calendar.set(Calendar.MINUTE, 20);
        calendar.set(Calendar.SECOND, 10);
        calendar.set(Calendar.MILLISECOND, 125);

        Date fecha = calendar.getTime();
        System.out.println("calendar = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SS a");
        String fechaConFormato = formato.format(fecha);
        System.out.println("fechaConFormato = " + fechaConFormato);
    }
}
