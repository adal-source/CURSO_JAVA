public class EjemploAutoMovilStatic {
    public static void main(String[] args) {
        /// funciones que porcesan datos

        /// clase            constructor
        //AutoMovil auto = new AutoMovil("impresa","subaru" );
        AutoMovil auto = new AutoMovil();
        auto.setFabricante("impresa");
        auto.setModelo("subaru");
        auto.setColor("blanco");
        auto.setCilindrada(2.0);

        //AutoMovil mazda = new AutoMovil("mazda","bt-50");
        AutoMovil mazda = new AutoMovil("mazda","bt-50","rojo",3.0);

        AutoMovil nissan = new AutoMovil("nissan","navara","gris oscuro",3.5,50);

        AutoMovil nissan2 = new AutoMovil();
        nissan2.setFabricante("nissan");
        nissan2.setModelo("navara");
        nissan2.setColor("gris oscuro");
        nissan2.setCilindrada(3.5);
        nissan2.setCapacidadTanque(50);

        AutoMovil.setColorPatente("verde");
        AutoMovil auto2 = new AutoMovil();

        System.out.println("son giales con == " + (nissan == nissan2));
        System.out.println("son giales con equals " + (nissan.equals(nissan2)));

        /// solo se llama el metodo dentro de automovil
        /// para imprimir todo
        System.out.println(auto.getFabricante());
        //auto.detalle();
        System.out.println(auto.verDetalle());
        System.out.println(nissan);
        //mazda.detalle();
        System.out.println(mazda.verDetalle());
        System.out.println(auto.acelerar(3000));
        System.out.println(auto.frenar());

        System.out.println();
        System.out.println(auto.acelerarFrenar(4000));

        System.out.println("kilometros por litro " + auto.calcularConsumo(300, 0.6f));
        System.out.println("kilometros por litro " + auto.calcularConsumo(300, 60));

        System.out.println(nissan);
        System.out.println(nissan.toString());
    }
}
