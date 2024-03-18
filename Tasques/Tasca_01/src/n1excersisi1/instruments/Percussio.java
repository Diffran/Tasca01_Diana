package n1excersisi1.instruments;

public class Percussio extends Instrument{
    //constructor que hereda els atributs de la classe instrument
    public Percussio(String nom, float preu){
        //super, paraula clau per heredar!
        super(nom, preu);
    }

    @Override
    public void tocar(){
        System.out.println("Està sonant un instrument de percussió");
    }

    //per demostrar que la classe només es carrega una vegada
    static{
        System.out.println("s'ha carregat la classe Percussio");
    }
}
