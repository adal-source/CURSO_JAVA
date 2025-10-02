public class Motor {

    private double cilindrada;
    private TipoMotor tipomotor;

    public Motor() {
    }

    public Motor(double cilindrada, TipoMotor tipomotor) {
        this.cilindrada = cilindrada;
        this.tipomotor = tipomotor;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public TipoMotor getTipomotor() {
        return tipomotor;
    }

    public void setTipomotor(TipoMotor tipomotor) {
        this.tipomotor = tipomotor;
    }
}
