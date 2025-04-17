class Persona{
    /// al ser privado no se tiene acceso por fuera de la clase
    private String nombre;

    /// metodo para modificar el valor de la variable
    public void modificarNombre(String nuvoNombre){
        /// al tener nombres diferentes se puede evitar el uso de this.
        nombre = nuvoNombre;
    }

    public String leerNombre(){
        return this.nombre;

    }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {
        Persona persona= new Persona();
        persona.modificarNombre("Adal");

        System.out.println("Inicia el metodo main " );
        System.out.println("persona = " + persona.leerNombre());

        System.out.println(" Antes de llamar al metodo test ");
        test(persona);

        System.out.println(" Despues de llamar al metodo test ");
        System.out.println("persona = " + persona.leerNombre());

        System.out.println("Finaliza el metodo main con los datos del arreglo modificados " );

    }

    public static void test(Persona persona) {
        System.out.println("Iniciamos el metodo test" );
        persona.modificarNombre("Felipe");
        System.out.println("Finaliza el metodo test" );
    }

}
