package n1exercici3;

public class Main {
    public static void main(String[] args) {
        String directori = args[0];
        String rutaEscriure = args[1];

        LlistarArbreEscriure.llistarEsciureDir(directori, rutaEscriure, null);
    }
}
