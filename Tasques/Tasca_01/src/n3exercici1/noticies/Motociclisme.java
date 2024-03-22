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
}
