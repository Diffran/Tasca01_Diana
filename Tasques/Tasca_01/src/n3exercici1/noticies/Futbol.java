package n3exercici1.noticies;

public class Futbol extends Noticia{
    private String competicio;
    private String club;
    private String jugador;

    public Futbol(String titular, int puntuacio, double preu, String competicio, String club, String jugador) {
        super(titular, puntuacio, preu);
        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;
    }


    @Override
    public double calcularPreuNoticia(Noticia noticia) {
        this.preu = 3;
        return 0;
    }
}
