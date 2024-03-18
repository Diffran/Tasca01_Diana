package n1excercisi2.vehicle;

public class Cotxe {
    private static final String marca = "Mercedes";
    private static String model = "XX"; //no té sentit canviar el model de tota la classe al fer el constructor
    private final double potencia;//no podra modificarse però pot ser especific de cada objecte de la classe

    public Cotxe(double potencia) {
        this.potencia = potencia;//l'unic que pot ser especific de lobjecte
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
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
