import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class EjemploSeccion8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha2 = new Date();

        System.out.println("Ingrese tu fecha de naciemto con formato 'yyyy-MM-dd'");
        try {
            Date fechaNa = format.parse(sc.next());

            if (fechaNa.before(fecha2)) {
                Calendar nacimiento = Calendar.getInstance();
                nacimiento.setTime(fechaNa);

                Calendar hoy = Calendar.getInstance();
                hoy.setTime(fecha2);

                int edad = hoy.get(Calendar.YEAR) - nacimiento.get(Calendar.YEAR);

                if (hoy.get(Calendar.DAY_OF_YEAR) < nacimiento.get(Calendar.DAY_OF_YEAR)) {
                    edad--;
                }

                System.out.println("Tu edad es: " + edad + " años");
            } else {
                System.out.println("La fecha de nacimiento debe ser anterior a la fecha actual.");
            }
        } catch (ParseException e) {
            System.out.println("Formato de fecha incorrecto. Usa 'yyyy-MM-dd'.");
            throw new RuntimeException(e);
        }
    }
}
