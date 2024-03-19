package n2exercici1.utils;

public class Smartphone extends Telefon implements Camera,Rellotge{
    public Smartphone(String marca, String model) {
        super(marca, model);
    }

    //s'han de definir els mètodes de les interficies obligatoriament perque son abstract
    @Override
    public void fotografiar(){//li he de donar visibilitat publica aqui
        System.out.println("S’està fent una foto");
    }
    @Override
    public void alarma() {
        System.out.println("Està sonant l’alarma");
    }
}
