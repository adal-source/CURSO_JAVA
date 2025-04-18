public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();
        Process process;

        try {
            if (System.setProperty("os.name","os.name").toLowerCase().startsWith("windows")) {
                process = rt.exec("notepad");

            } else {
                process = rt.exec("gedit");
            }
            process.waitFor();
        }catch (Exception e){
            System.err.println("El comando es desconocido" + e.getMessage());
            System.exit(1);

        }
        System.out.println("Se ha cerrado el editor");
        System.exit(0);
    }
}
