public class SentenciaForEach {
    public static void main(String[] args) {

        int[] nuemros= {1,2,3,4,5,9,14,11};

        for (int num: nuemros){
            System.out.println("num = " + num);

        }

        String [] nombres= {"Adal","Pepe", "Maria", "Lalo", "Bea", "Pato", "Pepa", "Paco"};

        for (String nombre: nombres){
            System.out.println("nombre = " + nombre);
        }
    }
}
