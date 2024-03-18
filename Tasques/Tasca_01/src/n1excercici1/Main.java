package n1excercici1;


import n1excercici1.instruments.Corda;
import n1excercici1.instruments.Percussio;
import n1excercici1.instruments.Vent;

public class Main {
    public static void main(String[] args) {

            System.out.println("Exercisi Instruments:");
            //carrega la classe instanciant objectes
            Vent flauta = new Vent("flauta",3.2f);
            Vent trompeta = new Vent("trompeta", 2.2f);
            trompeta.tocar(); //el metode abstracte de tocar instrument de vent

            Corda.metodeStatic();//es carrega la classe corda perque es un metod static, sense instrument tocant
            Corda guitarra = new Corda("guitarra", 3.6f);
            guitarra.tocar();//metode instrument de corda

            Percussio tambor = new Percussio("tambor", 4.6f);
            Percussio pandereta = new Percussio("pandereta", 1.0f);
            tambor.tocar();
            pandereta.tocar();

    }
}
