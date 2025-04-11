import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        /// variable = condicion ? si es verdadero; si es falso;
        String variable= 7 == 5 ? "si es verdadero":"si es falso";
        System.out.println("variable = " + variable);

        String estado= "";
        double promedio= 6.2;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un valor entre 2.0 y 7.0: ");
        matematicas = scanner.nextDouble();
        System.out.println("Ingrese un valor entre 2.0 y 7.0: ");
        ciencias = scanner.nextDouble();
        System.out.println("Ingrese un valor entre 2.0 y 7.0: ");
        historia = scanner.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3 ;
        System.out.println("promedio = " + promedio);

        estado = promedio >= 5.49 ? "aprovado":"rechazado";
        System.out.println("estado = " + estado);

        /*if(promedio >= 5.49){

            estado = "aprovado";
        }else {
            estado = "rechazado";
        }*/

        System.out.println("Ingrese los litros de gasolina entre 0 a 70: ");
        int gas = scanner.nextInt();

        String tanque = gas == 70 ?  "tanque lleno":
                gas >= 60 && gas < 70 ? "tanque casi lleno" :
                gas >= 40 && gas < 60 ? "tanque 3/4" :
                gas >= 35 && gas < 40 ? "medio tanque" :
                gas >= 20 && gas < 35 ? "suficiente" :
                gas >= 1 && gas < 20 ? "insuficiente" :
                        "vacio"
                ;
        System.out.println("tanque = " + tanque);

    }
}

