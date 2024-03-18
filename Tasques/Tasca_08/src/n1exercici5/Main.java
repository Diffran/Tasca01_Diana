package n1exercici5;

public class Main {
    public static void main(String[] args) {
        InterfazFuncional pi = () -> 3.1415;

        System.out.println(pi.getPiValue());
    }
}
