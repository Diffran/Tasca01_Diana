package n1exercici1;

public class TreballadorOnline extends Treballador{
    private static final double TARIFA_INT= 30;
    public TreballadorOnline(String nom, String cognom, float preuHora) {
        super(nom, cognom, preuHora);
    }

    @Override
    public double calcularSou(double hores){
        return hores*super.preuHora+TARIFA_INT;
    }
}
