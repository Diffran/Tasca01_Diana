package n1exercici2.pack;

public class TreballadorOnline extends Treballador {
    private static final double TARIFA_INT= 30;
    public TreballadorOnline(String nom, String cognom, double preuHora) {
        super(nom, cognom, preuHora);
    }

    @Override
    public double calcularSou(double hores){
        return hores*super.preuHora+TARIFA_INT;
    }


    //--------EXERCICI_02---------------------------------------
    public static void metodeNoObsolet(){
        System.out.println("Aquest mètode no estè obsolet");
    }

    @Deprecated
    public static void metodeObsolet(){
        System.out.println("Aquest mètode està obsolet");
    }

    @SuppressWarnings("deprecation")
    public static void utiizarMetodeObsolet(){
        metodeObsolet();
    }
}
