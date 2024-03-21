package n1excercici1.instruments;

public class Percussio extends Instrument{
    public Percussio(String nom, float preu){
        super(nom, preu);
    }

    @Override
    public void tocar(){
        System.out.println("Està sonant un instrument de percussió");
    }


    static{
        System.out.println("s'ha carregat la classe Percussio");
    }
}
