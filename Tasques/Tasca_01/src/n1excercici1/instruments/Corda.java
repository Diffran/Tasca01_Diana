package n1excercici1.instruments;

public class Corda extends Instrument{
    public Corda(String nom, float preu){
        super(nom, preu);
    }

    @Override
    public void tocar(){
        System.out.println("Està sonant un instrument de corda");
    }

    public static void metodeStatic(){
        System.out.println("per carregar la classe");
    }

    static{
        System.out.println("s'ha carregat la classe Corda");
    }

}
