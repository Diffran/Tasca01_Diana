package n1excercici1.instruments;

public class Corda extends Instrument{
    //constructor que hereda els atributs de la classe instrument
    public Corda(String nom, float preu){
        //super, paraula clau per heredar!
        super(nom, preu);
    }

    @Override
    public void tocar(){
        System.out.println("Està sonant un instrument de corda");
    }

    public static void metodeStatic(){
        System.out.println("per carregar la classe");
    }

    //per demostrar que la classe només es carrega una vegada
    static{
        System.out.println("s'ha carregat la classe Corda");
    }

}
