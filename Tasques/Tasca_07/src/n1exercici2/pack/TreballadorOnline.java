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
    //METODE NO OBSOLET
    public static void metodeNoObsolet(){
        System.out.println("Aquest mètode no estè obsolet");
    }
    //AFEGIR METODE OBSOLET
    @Deprecated
    public static void metodeObsolet(){
        System.out.println("Aquest mètode està obsolet");
    }
    //ANOTACIÓ QUE ELIMINA EL WARNING PER OBSOLET
    @SuppressWarnings("deprecation")
    public static void utiizarMetodeObsolet(){
        metodeObsolet();
    }
}
