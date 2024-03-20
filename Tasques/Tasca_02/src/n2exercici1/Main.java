package n2exercici1;

public class Main {
    public static void main(String[] args) {

        System.out.println("-------------INPUTMISMATCHEXCEPTION----------------------------");
        System.out.println("valor: "+Entrada.llegirByte("Entra un valor byte: "));
        System.out.println("valor: "+Entrada.llegirInt("Entra un valor int: "));
        System.out.println("valor: "+Entrada.llegirFloat("Entra un valor float: "));
        System.out.println("valor: "+Entrada.llegirDouble("Entra un valor double: "));
        System.out.println("-------------EXCEPTION----------------------------");
        System.out.println("valor: "+Entrada.llegirChar("Entra un valor char: "));
        System.out.println("valor: "+Entrada.llegirString("Entra un valor String: "));
        System.out.println("valor: "+Entrada.llegirSiNo("Entra un valor s o n: "));
    }
}
