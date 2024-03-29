package n1exercici1;

import n1exercici1.pack.Treballador;
import n1exercici1.pack.TreballadorOnline;
import n1exercici1.pack.TreballadorPresencial;

public class Main {
        public static void main(String[] args) {

        Treballador t1 = new Treballador("peter", "peterson", 7.2);
        TreballadorOnline t2 = new TreballadorOnline("juan", "García", 7.2);
        TreballadorPresencial t3 = new TreballadorPresencial("sofia","Martinez", 7.2);

        TreballadorPresencial.setBenzina(23.52);

        System.out.println("\nMateixes hores:");
        System.out.println("t1: "+t1.calcularSou(40));
        System.out.println("t2: "+t2.calcularSou(40));
        System.out.println("t3: "+t3.calcularSou(40));

        System.out.println("\nHores diferents:");
        System.out.println("t1: "+t1.calcularSou(40));
        System.out.println("t2: "+t2.calcularSou(36));
        System.out.println("t3: "+t3.calcularSou(20));
    }
}
