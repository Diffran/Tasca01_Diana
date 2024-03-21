package n1excercici2;

import n1excercici2.vehicle.Cotxe;

public class Main {
    public static void main(String[] args) {

        Cotxe.frenar();
        Cotxe c1 = new Cotxe(75);
        c1.accelerar();


        System.out.println("c1: Potencia->  "+c1.getPotencia()+" Model ->"+ Cotxe.getModel() +" Marca->"+ Cotxe.getMARCA());
        Cotxe.setModel("Mercedes");
        System.out.println("c1: Potencia->  "+c1.getPotencia()+" Model ->"+ Cotxe.getModel() +" Marca->"+ Cotxe.getMARCA());

    }
}
