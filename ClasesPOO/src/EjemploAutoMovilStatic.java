public class EjemploAutoMovilStatic {
    public static void main(String[] args) {
        /// funciones que porcesan datos

        /// clase            constructor
        //AutoMovil auto = new AutoMovil("impresa","subaru" );
        AutoMovil.setCapacidadTanqueEstatico(45);
        AutoMovil auto = new AutoMovil();
        auto.setFabricante("impresa");
        auto.setModelo("subaru");
        //auto.setColor("blanco");
        auto.setColor(String.valueOf(Color.NARANJA));
        //auto.setCilindrada(2.0);
        auto.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        auto.setEstanque(new Estanque());
        auto.setTipo(TipoAutomovil.HATCHBACK);

        //AutoMovil mazda = new AutoMovil("mazda","bt-50");
        AutoMovil mazda = new AutoMovil("mazda","bt-50","rojo",new Motor(3.0, TipoMotor.DIESEL));

        AutoMovil nissan = new AutoMovil("nissan","navara","gris oscuro",new Motor(3.0, TipoMotor.DIESEL),new Estanque(60));

        AutoMovil nissan2 = new AutoMovil("fourth","navara",AutoMovil.COLOR_AZUL,new Motor(3.0, TipoMotor.DIESEL),new Estanque(60));
//        nissan2.setFabricante("nissan");
//       nissan2.setModelo("navara");
//        nissan2.setColor("gris oscuro");
//        nissan2.setCilindrada(3.5);
//        nissan2.setCapacidadTanque(50);

        AutoMovil.setColorPatente("verde");
        AutoMovil auto2 = new AutoMovil();

        System.out.println("son giales con == " + (nissan == nissan2));
        System.out.println("son giales con equals " + (nissan.equals(nissan2)));

        /// solo se llama el metodo dentro de automovil
        /// para imprimir todo
        System.out.println(auto.getFabricante());
        //auto.detalle();
        System.out.println(auto.verDetalle());
        System.out.println("*****************");
        System.out.println(nissan.verDetalle());
        System.out.println(nissan.acelerar(3000));
        System.out.println(nissan.frenar());
        //mazda.detalle();
        System.out.println("*****************");
        System.out.println(mazda);
        System.out.println(mazda.verDetalle());
        System.out.println(auto.acelerar(3000));
        System.out.println(auto.frenar());
        System.out.println("*****************");
        System.out.println(nissan2);
        System.out.println(nissan2.verDetalle());
        System.out.println(nissan2.acelerar(3000));
        System.out.println(nissan2.frenar());

        System.out.println("***************");
        System.out.println();
        System.out.println(auto.acelerarFrenar(4000));

        System.out.println("kilometros por litro " + auto.calcularConsumo(300, 0.6f));
        System.out.println("kilometros por litro " + auto.calcularConsumo(300, 60));

        System.out.println(nissan);
        System.out.println(nissan.toString());

        System.out.println("Automovil.getColorPatente() = " + AutoMovil.getColorPatente());
        System.out.println("kilometros por litro = "+ mazda.calcularConsumoEstatico(300, 60));
        System.out.println("velocidad maxima carretera" + AutoMovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("velocidad maxima ciudad" + AutoMovil.VELOCIDAD_MAX_CIUDAD);

        TipoAutomovil tipoAutomovil = auto.getTipo();
        System.out.println("tipo auto " + tipoAutomovil.getNombre());

        switch (tipoAutomovil){
            case CONVERTIBLE -> System.out.println("el automovil es deportivo y descapotable de dos puertas");

            case COUPE -> System.out.println("Es un automovil pequeño de dos puertas y tipicamente deportivo");

            case FURGON -> System.out.println("Es un automovil utilitario de transporte, de empresas");

            case HATCHBACK -> System.out.println("Es un automovil mediano compacto, aspecto deportivo");

            case PICKUP -> System.out.println("Es un automovil de doble compacto, aspecto deportivo");

            case SEDAN -> System.out.println("Es un automovil mediano");

            case STATION_WAGON -> System.out.println("Es un automovil mas grande, con maleta grande....");
        }

        TipoAutomovil[] tipos = tipoAutomovil.values();
        for (TipoAutomovil tipo: tipos){
            System.out.println(tipo + " => " + tipo.name() + ", " + tipo.getNombre() + ", " + tipo.getDescripcion() + ", " + tipo.getNumeroPuerta());
            System.out.println();
        }

    }
}
