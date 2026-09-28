public class Main {

    public static void main(String[] args) {
        Peon[] peonblanco = new Peon[8];
        Peon[] peonnegro = new Peon[8];

        for (int i = 0; i <= 7; i++) {
            peonblanco[i] = new Peon("blanco", "lento", "agresivo", "ladino");
            peonnegro[i] = new Peon("negro", "lento", "agresivo", "ladino");
        }
        Caballo[] caballoblanco = new Caballo[2];
        Caballo[] caballonegro = new Caballo[2];

        for (int i = 0; i < 2; i++) {
            caballoblanco[i] = new Caballo("blanco", "", "ligero", "");
            caballonegro[i] = new Caballo("negro", "", "ligero", "");
        }

        Torre[] torrenegro = new Torre[2];
        Torre[] torreblanco = new Torre[2];

        for (int i = 0; i < 2; i++) {
            torreblanco[i] = new Torre("blanco", "", "homerica", "directa");
            torrenegro[i] = new Torre("negro", "", "homerica  ", "directa");
        }

        Alfil[] alfilblanco = new Alfil[2];
        Alfil[] alfilnegro = new Alfil[2];

        for (int i = 0; i < 2; i++) {
            alfilblanco[i] = new Alfil("blanco", "", "sesgo", "oblicuo");
            alfilnegro[i] = new Alfil("negro", "", "sesgo", "oblicuo");
        }

        Rey[] reyblanco = new Rey[1];
        Rey[] reynegro = new Rey[1];

        for (int i = 0; i < 1; i++) {
            reyblanco[i] = new Rey("blanco", "", "postero", "tenue");
            reynegro[i] = new Rey("negro", "", "postero", "tenue");
        }
        
        Reina[] reinablanca = new Reina[1];
        Reina[] reinanegra = new Reina[1];
        for (int i = 0; i < 1; i++) {
            reinablanca[i] = new Reina("blanco", "", "poderosa", "tenue");
            reinanegra[i] = new Reina("negro", "", "poderosa", "tenue");
        }
        int cont=1;
        System.out.println("------------------------------------------");

        for (Peon p:peonblanco){
            System.out.println("Peon " + cont);
            System.out.println(p.getColor());
            System.out.print(p.getMovimiento()+"\n");
            System.out.print(p.getComportamiento()+"\n");
            System.out.print(p.getVelocidad()+"\n");
            System.out.println("------------------------------------------");

            cont++;

        }
}
} 