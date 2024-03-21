package n3exercici1.noticies;

public class Tenis extends Noticia{
    private String competicio;
    private String tenistes;

    public Tenis(String titular, int puntuacio, double preu, String competicio, String tenistes) {
        super(titular, puntuacio, preu);
        this.competicio = competicio;
        this.tenistes = tenistes;
    }
}
