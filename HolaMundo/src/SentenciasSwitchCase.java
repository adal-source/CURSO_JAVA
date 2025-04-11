public class SentenciasSwitchCase {
    public static void main(String[] args) {
        /// se puede hacer con cualquier variable soloque se tiene que
        /// los casos coincidan con la forma en la que se declara la variable usada
         byte num = 4;
         //char num = '1'
         switch(num) {
             // case '1':
             case 0:
                 System.out.println("el num es cero");
                 break;
             case 1:
                 System.out.println("el num es 1");
                 break;
             case 2:
                 System.out.println("el num es 2");
                 break;
             case 3:
                 System.out.println("el num es 3");
                 break;
             default:
                 System.out.println("el num es mayor a las opciones");

         }

         int mes = 12;
         String nombreMes = null;
        /// al quitar brak al final de cada caso provoca que los casos sigan corriendo
        /// hats que no aparesca uno sera como dara final y se presentara el resultado de dicho caso
         switch(mes) {
             case 1:
                 nombreMes = "Enero";
                 System.out.println("el num es mes enero");
                 break;
             case 2:
                 nombreMes = "Febrero";
                 System.out.println("el num es mes febrero");
                 break;
             case 3:
                 nombreMes = "Marzo";
                 System.out.println("el num es mes marzo");
                 break;
             case 4:
                 nombreMes = "Abril";
                 System.out.println("el num es mes abril");
                 break;
             case 5:
                 nombreMes = "Mayo";
                 System.out.println("el num es mes mayo");
                 break;
             case 6:
                 nombreMes = "Junio";
                 System.out.println("el num es mes junio");
                 break;
             case 7:
                 nombreMes = "Julio";
                 System.out.println("el num es mes julio");
                 break;
             case 8:
                 nombreMes = "Agosto";
                 System.out.println("el num es mes agosto");
                 break;
             case 9:
                 nombreMes = "Septiember";
                 System.out.println("el num es mes septiember");
                 break;
             case 10:
                 nombreMes = "Octubre";
                 System.out.println("el num es mes octubre");
                 break;
             case 11:
                 nombreMes = "Noviember";
                 System.out.println("el num es mes noviember");
                 break;
             case 12:
                 nombreMes = "Diciember";
                 System.out.println("el num es mes diciember");
                 break;
             default:
                 System.out.println("no quedan mas meses");

         }
    }
}
