package n3exercici1.noticies;

public class F1 extends Noticia{
    private String escuderia;

    public F1(String titular, int puntuacio, double preu, String escuderia) {
        super(titular, puntuacio, preu);
        this.escuderia = escuderia;
    }
}
