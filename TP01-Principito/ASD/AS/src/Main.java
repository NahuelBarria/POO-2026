public class Main {
    public static void main(String[] args) {

        System.out.println("BIENVENIDO AL PROGRAMA PRINCIPITO");
        System.out.println("_____________________________________________________________________________________");
        
        System.out.println("Texto literario con la flor del principito:\n");

        Flor florDelLibro = new Flor();
        florDelLibro.setActitud("vanidosa");
        florDelLibro.setApariencia("hermosa");
        florDelLibro.setEstado("sola");
        florDelLibro.setOrugas(5);

        Principito principito = new Principito();
        principito.setFlorPrincipito(florDelLibro);


        System.out.println("El principito quería profundamente a su flor y se ocupaba de ella cada\r\n" +
        "jornada: la regaba y le sacaba las orugas de encima. Ella, si bien un poco " + florDelLibro.getActitud() + ",\r\n" +
        "resultaba " + florDelLibro.getApariencia() + " y le agradecía tanta dedicación. Con el tiempo, el\r\n" +
        "principito resolvió partir a conocer otros planetas y, aunque le costaba dejarla " + florDelLibro.getEstado() + ",\r\n" +
        "entendía que su viaje era necesario para seguir aprendiendo del universo. ");

        System.out.println("_____________________________________________________________________________________");
        System.out.println("Texto literario con la flor secundaria:\n");

        Flor florPropia = new Flor();
        florPropia.setActitud("timida");
        florPropia.setApariencia("linda");
        florPropia.setEstado("acompañada");
        florPropia.setOrugas(0);

        System.out.println("El principito quería profundamente a su flor y se ocupaba de ella cada\r\n" +
        "jornada: la regaba y le sacaba las orugas de encima. Ella, si bien un poco " + florPropia.getActitud() + ",\r\n" +
        "resultaba " + florPropia.getApariencia() + " y le agradecía tanta dedicación. Con el tiempo, el\r\n" +
        "principito resolvió partir a conocer otros planetas y, aunque le costaba dejarla " + florPropia.getEstado() + ",\r\n" +
        "entendía que su viaje era necesario para seguir aprendiendo del universo. ");

        System.out.println("_____________________________________________________________________________________");

        System.out.println("Atributos de la flor del principito:");
        principito.ImprimirFlorPrincipito();

        System.out.println("\nAtributos de la flor secundaria:");
        System.out.println("Actitud:" + florPropia.getActitud());
        System.out.println("Apariencia:" + florPropia.getApariencia());
        System.out.println("Estado:" + florPropia.getEstado());
        System.out.println("Orugas:" + florPropia.getOrugas());

    }

}
