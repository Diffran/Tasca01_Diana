package n1exercici1;

import n1exercici1.nogeneric.TreballadorOnline;
import n1exercici1.nogeneric.TreballadorPresencial;

public class Main {
        public static void main(String[] args) {

        TreballadorOnline t2 = new TreballadorOnline("juan", "García", 7.2);
        TreballadorPresencial t3 = new TreballadorPresencial("sofia","Martinez", 7.2);

        System.out.println("\nMateixes hores:");
        System.out.println("t2: "+t2.calcularSou(40));
        System.out.println("t3: "+t3.calcularSou(40));

        System.out.println("\nHores diferents:");
        System.out.println("t2: "+t2.calcularSou(36));
        System.out.println("t3: "+t3.calcularSou(20));
    }
}
