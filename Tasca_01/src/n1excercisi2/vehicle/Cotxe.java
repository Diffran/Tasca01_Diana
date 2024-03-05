package n1excercisi2.vehicle;

public class Cotxe {
    private static final String marca = "Mercedes";
    private static String model = "XX";
    private final double potencia;

    public Cotxe(double potencia) {
        this.potencia = potencia;
    }

    public static java.lang.String getModel() {
        return model;
    }

    public static void setModel(java.lang.String model) {
        Cotxe.model = model;
    }

    public double getPotencia() {
        return potencia;
    }
    public static void frenar(){
        System.out.println("El vehicle està frenant");
    }
    public void accelerar(){
        System.out.println("El vehicle està accelerant");
    }
}
