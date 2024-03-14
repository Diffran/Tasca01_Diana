package n1exercici4;

import n1exercici5.CotxeSerial;
import n1exercici5.Serialitzar;

public class Main {
    public static void main(String[] args) {
        //String fitxer = args[0];
        //LlegirIEscriureEx4.llegirFitxer(fitxer);
        CotxeSerial a = new CotxeSerial("m","m");
        Serialitzar.serialitzarObj(a);
        CotxeSerial b = Serialitzar.deserialitzarObj("serial.ser");
        System.out.println(b.getMarca());
    }
}
