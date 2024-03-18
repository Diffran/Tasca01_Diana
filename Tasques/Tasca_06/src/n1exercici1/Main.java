package n1exercici1;

public class Main {
    public static void main(String[] args) {
        NoGenericMethods noGenerics = new NoGenericMethods("primer","segon","tercer");
        System.out.println(noGenerics.getObj1()+"-"+noGenerics.getObj2()+"-"+noGenerics.getObj3());
        //canviar l'ordre dels objectes amb els metodes setters per comprovar que es poden posar en qualsevol posició
        noGenerics.setObj1(noGenerics.getObj2());
        noGenerics.setObj2(noGenerics.getObj3());
        System.out.println("--------------------------------------------------------------");
        System.out.println(noGenerics.getObj1()+"-"+noGenerics.getObj2()+"-"+noGenerics.getObj3());

    }
}
