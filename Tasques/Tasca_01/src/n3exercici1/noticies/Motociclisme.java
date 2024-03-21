package n3exercici1.noticies;

public class Motociclisme extends Noticia {
    private String equip;

    public Motociclisme(String titular, int puntuacio, double preu, String equip) {
        super(titular, puntuacio, preu);
        this.equip = equip;
    }
}
