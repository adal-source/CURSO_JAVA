import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        String [] nombres= {"Adal","Pepe", "Maria", "Lalo", "Bea", "Pato", "Pepa", "Paco"};
         int count = nombres.length;
        for (int i = 0; i < count; i++){

            /*
            * para quitar ciertos elementos se puede hacer de la siguiente manera
            *
            * if(nombre[i].toLowerCase().contains("ADAL".toLowerCase()) ||
            * nombre[i].toLowerCase().contains("pePa".toLowerCase())
            * ){
            *   continue;
            * }
            *
            * */
            System.out.println(i + " - " + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\" o \"Maria\":");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0; i < count; i++){

            /// se busca en el sistema ignorando cualquier forma de minuscula y mayuscula
            if (nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
            System.out.println("nombres = " + nombres[i]);
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado");
        } else {
            JOptionPane.showMessageDialog(null, buscar + " no existe en el sistema");
        }
    }
}
