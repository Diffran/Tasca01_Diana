package n1excercici2;

import n1excercici2.vehicle.Cotxe;

public class Main {
    public static void main(String[] args) {

        Cotxe.frenar();
        Cotxe c1 = new Cotxe(75);
        c1.accelerar();


        System.out.println(c1.toString());
        Cotxe.setModel("CLA C");
        System.out.println(c1.toString());//Correccio
    }
}
