package n1exercici1.pack;

public class TreballadorPresencial extends Treballador{
    private static double benzina;
    public TreballadorPresencial(String nom, String cognom, double preuHora) {
        super(nom, cognom, preuHora);
    }

    public static double getBenzina() {
        return benzina;
    }

    public static void setBenzina(double benzina) {
        TreballadorPresencial.benzina = benzina;
    }

    @Override
    public double calcularSou(double hores){
        return hores*super.preuHora+getBenzina();
    }
}
