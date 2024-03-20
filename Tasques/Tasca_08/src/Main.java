import n1exercici8.InvertirCad;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String paraula;

        System.out.println("introdueix una paraula: ");
        paraula = lector.nextLine();

        //escriure el bloc del metode amb un lambda
        InvertirCad interfaz = (palabra) -> {
            StringBuilder escritor = new StringBuilder(paraula);
            return escritor.reverse().toString();
        };

        /**
         * instanciar la inteficie, per utilitzar reversed, cal que al bloc de codi hi hagi
        * un .reverse() o sigui que faci un reverse.
        * és com que s'ha d'especificar que fa
         **/
        System.out.println(interfaz.reversed(paraula));
    }
}