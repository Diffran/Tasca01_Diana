package n3exercici1.noticies;

public class Basquet extends Noticia{
    private String competicio;
    private String jugador;

    public Basquet(String titular, int puntuacio, double preu, String competicio, String jugador) {
        super(titular, puntuacio, preu);
        this.competicio = competicio;
        this.jugador = jugador;
    }
}
