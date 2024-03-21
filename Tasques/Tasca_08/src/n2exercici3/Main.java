package n2exercici3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        float num1, num2;

        System.out.println("Entra 2 numeros: ");
        num1 = lector.nextFloat();
        num2 = lector.nextFloat();

        Operacio suma = () -> num1+num2;
        Operacio resta = () -> num1-num2;
        Operacio multiplicacio = () -> num1*num2;
        Operacio divisio = () -> {
            try{
                return num2 != 0 ? num1/num2 : Float.NaN;
            }catch(ArithmeticException e){
                return Float.NaN;
            }
        };

        System.out.println("Suma: " + suma.operacio());
        System.out.println("Resta: " + resta.operacio());
        System.out.println("Multiplicació: " + multiplicacio.operacio());
        System.out.println("Divisió: " + divisio.operacio());
    }
}
