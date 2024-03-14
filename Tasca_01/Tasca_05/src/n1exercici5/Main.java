package n1exercici5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //serialitzar -s deserialitzar -d
        String opcio = args[0], matricula, model;
        Scanner lector = new Scanner(System.in);

        if(opcio.equals("-s")) {
            System.out.println("introdueix marca: ");
            matricula = lector.nextLine();
            System.out.println("introdueix model: ");
            model = lector.nextLine();
            CotxeSerial a = new CotxeSerial(matricula, model);
            Serialitzar.serialitzarObj(a);
        }
        if(opcio.equals("-d")){
            CotxeSerial b = Serialitzar.deserialitzarObj("serial.ser");
            System.out.println("el cotxe deserialitzat te la matricula: "+b.getMatricula()+" model: " + b.getModel());
        }
    }
}
