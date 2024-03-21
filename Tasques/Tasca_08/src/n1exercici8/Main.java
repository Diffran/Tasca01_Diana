package n1exercici8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String entradaUsu;

        System.out.println("Entra una cadena: ");
        entradaUsu = lector.nextLine();


        InvertirCad entradaInvertida = cadena -> new StringBuilder(cadena).reverse().toString();

        System.out.println("--------CADENA INVERTIDA--------------");
        System.out.println(entradaInvertida.reversed(entradaUsu));
        //insancia de la interfaz.metodeInterfaz(param)
    }
}
