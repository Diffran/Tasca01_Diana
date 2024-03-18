package n1excercici1.instruments;

public class  Vent extends Instrument {
    //constructor que hereda els atributs de la classe instrument
    public Vent(String nom, float preu){
        //super, paraula clau per heredar!
        super(nom, preu);
    }

    @Override
    public void tocar(){
        System.out.println("Està sonant un instrument de vent");
    }

    //per demostrar que la classe només es carrega una vegada
    static{
        System.out.println("s'ha carregat la classe Vent");
    }
}
