package n2exercici1.utils;

public class Telefon {
    private String marca;
    private String model;

    public Telefon(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    public void trucar(String numeroTel){
        System.out.println("s'està trucant al "+numeroTel);
    }

}
