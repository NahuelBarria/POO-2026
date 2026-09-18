public abstract class Pieza {
    private String color;
    private String velocidad;
    private String comportamiento;
    private String movimiento;

    public Pieza() {
    }

    public Pieza(String color, String velocidad, String comportamiento, String movimiento) {
        this.color = color;
        this.velocidad = velocidad;
        this.comportamiento = comportamiento;
        this.movimiento = movimiento;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }

    public static void imprimirPiezas(Pieza[] arreglo) {
        int cont = 1;
        for (Pieza p : arreglo) {
            if (p != null) {
                System.out.println(cont + ". " + p.toString());
                cont++;
            }
        }
        System.out.println("----------------------------------------------");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + getColor() + 
            " (Velocidad: " + getVelocidad() + 
            ", Comportamiento: " + getComportamiento() + 
            ", Movimiento: " + getMovimiento() + ")";
} 
}