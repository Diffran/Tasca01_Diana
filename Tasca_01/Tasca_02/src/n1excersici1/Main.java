package n1excersici1;

import n1excersici1.botiga.Producte;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double preuP;
        String nomP;
        Scanner lector = new Scanner(System.in);
        //de moment només pots fer una compra de 10 productes
        Producte[] producteLlista = new Producte[10];//es temporal, per poder crear un objecte Venta
        for(int i=0; i<producteLlista.length; i++) {
            System.out.println("introdueix nom del producte: ");
            nomP = lector.nextLine();
            System.out.println("introdueix preu del producte");
            preuP = Double.parseDouble(lector.nextLine());
            //amb les dades recollides creo un objecte producte
            producteLlista[i]= new Producte(nomP, preuP);

        }
    }
}
