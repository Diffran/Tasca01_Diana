package n3exercici1.noticies;

public class Futbol extends Noticia{
    private String competicio;
    private String club;
    private String jugador;

    public Futbol(String titular,  String competicio, String club, String jugador) {
        super(titular);
        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;

        this.preu = calcularPreuNoticia();
    }

    @Override
    public double calcularPreuNoticia() {
        this.preu = 300;

        if(this.competicio.equalsIgnoreCase("lliga de campions")){
            this.preu += 100;
        }

        if(this.club.equalsIgnoreCase("barça") || this.club.equalsIgnoreCase("madrid")){
            this.preu += 100;
        }

        if(this.jugador.equalsIgnoreCase("ferran torres") || this.jugador.equalsIgnoreCase("benzema")){
            this.preu += 50;
        }
        return this.preu;
    }
}
