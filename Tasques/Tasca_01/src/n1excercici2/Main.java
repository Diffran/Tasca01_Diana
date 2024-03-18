package n1excercici2;

import n1excercici2.vehicle.Cotxe;

public class Main {
    public static void main(String[] args) {
        Cotxe.frenar();//no necessita objecte perque es static
        //instancia per poder utilitzar laltre metode
        Cotxe c1 = new Cotxe(75);
        c1.accelerar();
    }
}
