public class AutoMovil {

    private int capacidadTanque;
    private int id;
    private String fabricante;
    private String modelo;
    private String color;
    private double cilindrada;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;

    private TipoAutomovil tipo;

    private static String colorPatente = "naranja";
    private static int capacidadTanqueEstatico = 30;
    private static int ultimoId;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final Integer VELOCIDAD_MAX_CIUDAD = 60;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris";
    public static final String COLOR_AZUL = "Azul";

    // ejemplo de un constructor
    /// no es un miembro de la clase y es void por defecto aun que no se pone
    public AutoMovil(){
        this.id= ++ultimoId;
    }

    public AutoMovil(String fabricante){
        this();
        this.fabricante = fabricante;
    }

    public AutoMovil(String fabricante, String modelo){
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public AutoMovil(String fabricante, String modelo, String color){
        // forma de llamar al constructor de esta manera se ahorra codigo o se optimiza
        this(fabricante, modelo);
        this.color = color;
    }

    public AutoMovil(String fabricante, String modelo, String color, Motor motor){
        // forma de llamar al constructor de esta manera se ahorra codigo o se optimiza
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public AutoMovil(String fabricante, String modelo, String color, Motor motor, Estanque estanque){
        this(fabricante, modelo, color, motor);
        this.estanque = estanque;
    }

    public AutoMovil(String fabricante, String modelo, String color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    public static String getColorPatente(){
        return colorPatente;
    }

    public static void setColorPatente(String colorPatente) {
        AutoMovil.colorPatente = colorPatente;
    }

    public static int getCapacidadTanqueEstatico() {
        return capacidadTanqueEstatico;
    }

    public static void setCapacidadTanqueEstatico(int capacidadTanqueEstatico) {
        AutoMovil.capacidadTanqueEstatico = capacidadTanqueEstatico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getUltimoId() {
        return ultimoId;
    }

    public static void setUltimoId(int ultimoId) {
        AutoMovil.ultimoId = ultimoId;
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

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    /// funciones / comportamientos
    public String verDetalle(){ //verDetalle
        /// por defecto se asume que es atributo de la clase

        String sb = "this.id = " + this.id +
                "\nthis.fabricante = " + this.fabricante +
                "\n this.modelo = " + this.modelo +
                "\n this.tipo = " + this.getTipo() +
                "\n this.color = " + this.color +
                "\n auto.patenteColor = " + colorPatente +
                "\n this.cilindrada = " + this.motor.getCilindrada();
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
        return km/(estanque.getCapacidad() * porcentajeBencina);
    }

    /// sobre escribiendo metodo del padre para ello se utiliza la notacion que se encuentra abajo
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

    public static float calcularConsumoEstatico(int km, int porcentajeBencina){
        return km/(AutoMovil.capacidadTanqueEstatico*(porcentajeBencina/100f));
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

