package n1excercici1.instruments;

public class  Vent extends Instrument {
    public Vent(String nom, float preu){
        super(nom, preu);
    }

    @Override
    public void tocar(){
        System.out.println("Està sonant un instrument de vent");
    }

    static{
        System.out.println("s'ha carregat la classe Vent");
    }
}
