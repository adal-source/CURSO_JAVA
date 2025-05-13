import java.util.Scanner;

public class EjemploArregloNotasAlumno {
    public static void main(String[] args) {

        double[] claseMatematicas,claseHistoria,claseLenguaje;
        double sumNotasMatematicas = 0,sumNotasHistoria = 0,sumNotasLenguaje  = 0;
        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        Scanner sc =new Scanner(System.in);
        System.out.println("ingrese 7 notas de estudiantes para matematicas");
        for (int i = 0; i < claseMatematicas.length ; i++){
            claseMatematicas[i] = sc.nextDouble();

        }
        System.out.println("ingrese 7 notas de estudiantes para historia");
        for (int i = 0; i < claseHistoria.length ; i++){
            claseHistoria[i] = sc.nextDouble();

        }
        System.out.println("ingrese 7 notas de estudiantes para lenguaje");
        for (int i = 0; i < claseLenguaje.length ; i++){
            claseLenguaje[i] = sc.nextDouble();

        }

        for (int i = 0; i < 7 ; i++){
            sumNotasMatematicas += claseMatematicas[i];
            sumNotasHistoria += claseHistoria[i];
            sumNotasLenguaje += claseLenguaje[i];
        }
        double promedioMatematicas = (sumNotasMatematicas / claseMatematicas.length);
        double promedioHistoria = (sumNotasHistoria / claseHistoria.length);
        double promedioLenguaje = (sumNotasLenguaje / claseLenguaje.length);
        double promediototal = (promedioMatematicas + promedioHistoria
                                + promedioLenguaje) / 3;
        System.out.println("Promedio clase Matematicas = " + promedioMatematicas);
        System.out.println("Promedio clase Historia = " + promedioHistoria);
        System.out.println("Promedio clase Lenguaje = " + promedioLenguaje);
        System.out.println("Promedio General = " + promediototal);

        System.out.println("ingrese el identificador del alumno (del 0 al 6)");
        int id = sc.nextInt();
        double promedioAlumno = (claseHistoria[id] + claseMatematicas[id] + claseLenguaje[id]) / 3;
        System.out.println("promedioAlumno = " + promedioAlumno);
    }
}
