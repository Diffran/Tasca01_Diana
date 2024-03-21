import n1exercici8.InvertirCad;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String paraula;

        System.out.println("introdueix una paraula: ");
        paraula = lector.nextLine();

        InvertirCad interfaz = (palabra) -> {
            StringBuilder escritor = new StringBuilder(paraula);
            return escritor.reverse().toString();
        };

        System.out.println(interfaz.reversed(paraula));
    }
}