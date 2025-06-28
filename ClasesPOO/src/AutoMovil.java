public class AutoMovil {

    private String fabricante;
    private String modelo;
    private String color;
    private double cilindrada;
    private int capacidadTanque = 40;

    private static String colorPatente = "naranja";

    // ejemplo de un constructor
    /// no es un miembro de la clase y es void por defecto aun que no se pone
    public AutoMovil(){}

    public AutoMovil(String fabricante){
        this.fabricante = fabricante;
    }

    public AutoMovil(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public AutoMovil(String fabricante, String modelo, String color){
        // forma de llamar al constructor de esta manera se ahorra codigo o se optimiza
        this(fabricante, modelo);
        this.color = color;
    }

    public AutoMovil(String fabricante, String modelo, String color, double cilindrada){
        // forma de llamar al constructor de esta manera se ahorra codigo o se optimiza
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
    }

    public AutoMovil(String fabricante, String modelo, String color, double cilindrada, int capacidadTanque){
        this(fabricante, modelo, color, cilindrada);
        this.capacidadTanque = capacidadTanque;
    }


    public static String getColorPatente(){
        return colorPatente;
    }

    public static void setColorPatente(String colorPatente) {
        AutoMovil.colorPatente = colorPatente;
    }

    public String getFabricante(){
        return this.fabricante;
    }
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public String getModelo(){
        return this.fabricante;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public double getCilindrada(){
        return this.cilindrada;
    }
    public void setCilindrada(double cilindrada){
        this.cilindrada = cilindrada;
    }

    public int getCapacidadTanque(){
        return this.capacidadTanque;
    }
    public void setCapacidadTanque(int capacidadTanque){
        this.capacidadTanque = capacidadTanque;
    }

    /// funciones / comportamientos
    public String verDetalle(){ //verDetalle
        /// por defecto se asume que es atributo de la clase

        String sb = "this.fabricante = " + this.fabricante +
                "\n this.modelo = " + this.modelo +
                "\n this.color = " + this.color +
                "\n auto.patenteColor = " + colorPatente +
                "\n this.cilindrada = " + this.cilindrada;
        return sb;

        /*

        StringBuilder sb = new StringBuilder();

        sb.append("this.fabricante = " + this.fabricante);
        sb.append("\n this.modelo = " + this.modelo);
        sb.append("\n this.color = " + this.color);
        sb.append("\n this.cilindrada = " + this.cilindrada);

        System.out.println("this.fabricante = " + this.fabricante);
        System.out.println("this.modelo = " + this.modelo);
        System.out.println("this.color = " + this.color);
        System.out.println("this.cilindrada = " + this.cilindrada);
        */
    }

    public String acelerar(int rpm){
        return "el auto " + fabricante + " acelerando a " + rpm + " rmp";

    }

    public String frenar(){
        return "el auto " + fabricante + " frenando!!";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();

        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina){
        return km/(capacidadTanque*porcentajeBencina);
    }

    /// con el mismo nombre se conce como sobre carga de metodos
    public float calcularConsumo(int km, int porcentajeBencina){
        /// se debe poner f para que el resultado sea en punto flotante y que no se redondee
        return km/(capacidadTanque*(porcentajeBencina/100f));
    }

    /// sobre escribiendo metodo del padre
    @Override
    public boolean equals(Object obj) {
        AutoMovil a = (AutoMovil) obj;
        /*
        // si es el mismo objeto no sera necesario comparar
            if (this == obj){
            return true;
            }
        * */

        // se indica que si no es una estancia de automovil que por defecto
        // sea false, en lugar de dar error que indica java
        if (!(obj instanceof AutoMovil)) {
            return false;
        }
        // con esto se valida si los valores son nulos
        return (this.fabricante != null && this.modelo != null
                &&this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo()));
    }

   /* @Override// sobre escirbiendo la clase padre
    public String toString(){
        return "Automovil{" +
                "fabricante=" + fabricante + '\'' +
                ", modelo=" + modelo + '\'' +
                ", color=" + color + '\'' +
                ", cilindrada" + cilindrada + '\'' +
                ", capacidadEstanque" + capacidadTanque + '\'' +
                "}";
    }
    *
    */
}

