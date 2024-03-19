package n2exercici1.utils;

public class Telefon {
    protected String marca;
    protected String model;

    public Telefon(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    public void trucar(String numeroTel){
        System.out.println("s'està trucant al "+numeroTel);
    }
}
