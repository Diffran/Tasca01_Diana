package n3exercici1.noticies;

public class Motociclisme extends Noticia {
    private String equip;

    public Motociclisme(String titular, String equip) {
        super(titular);
        this.equip = equip;

        this.preu = calcularPreuNoticia();
    }

    @Override
    public double calcularPreuNoticia(){
        this.preu = 100;

        if(this.equip.equalsIgnoreCase("honda") || this.equip.equalsIgnoreCase("yamaha")){
            this.preu += 50;
        }

        return this.preu;
    }
    @Override
    public int calcularPuntuacioNoticia(){
        this.puntuacio = 3;

        if(this.equip.equalsIgnoreCase("honda") || this.equip.equalsIgnoreCase("yamaha")){
            this.puntuacio += 3;
        }

        return this.puntuacio;
    }

    @Override
    public void mostrarNot(){
        System.out.println("Titular: "+this.titular);
        System.out.println("Equip: "+this.equip);
        System.out.println("Text: "+this.text);
        System.out.println("Preu: "+this.preu);
        System.out.println("Puntuacio: "+this.puntuacio);
    }
}
