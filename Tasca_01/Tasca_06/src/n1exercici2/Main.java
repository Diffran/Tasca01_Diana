package n1exercici2;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Leandro","Gastón", 60);
        GenericMethods.metodeGeneric(p,"lletras",2);
        System.out.println("--------------------------------------------------");
        GenericMethods.metodeGeneric("lletras",2,p);

    }
}
