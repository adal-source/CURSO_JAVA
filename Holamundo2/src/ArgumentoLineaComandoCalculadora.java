public class ArgumentoLineaComandoCalculadora {
    public static void main(String[] args) {

        if (args.length !=3){
            System.out.println("por favor ingresar una operacion" +
                    "suma, resat, divir, multi y dos enteros");

        }
        String operaciones = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        double res = 0.00;

        switch (operaciones){
            case "suma":
                res = a+b;
                break;

            case "resta":
                res = a-b;
                break;

            case "dividir":
                if (b == 0){
                    System.out.println("no se puede dividir por 0");
                    System.exit(-1);

                }else{
                    res = (double)a/b;

                }
                break;

            case "multi":
                res = a*b;
                break;

            default:
                res = a+b;
        }
        System.out.println("resultado de la operacion '" + operaciones +"' es: " + res);
    }
}
