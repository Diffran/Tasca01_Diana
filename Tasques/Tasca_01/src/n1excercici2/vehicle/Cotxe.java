package n1excercici2.vehicle;

public class Cotxe {
    private static final String MARCA = "Mercedes";
    private static String model = "XX";
    private final double potencia;

    public Cotxe(double potencia) {
        this.potencia = potencia;
    }

    public static String getMARCA() {
        return MARCA;
    }
    public static String getModel() {
        return model;
    }
    public double getPotencia() {
        return potencia;
    }
    public static void setModel(String model) {
        Cotxe.model = model;
    }


    public static void frenar(){
        System.out.println("El vehicle està frenant");
    }
    public void accelerar(){
        System.out.println("El vehicle està accelerant");
    }

    //CORRECIÓ
    @Override
    public String toString(){
        return "Potencia-> "+this.potencia+" Model->"+this.model+" Marca->"+MARCA;
    }
}
