package n3exercici1.noticies;

public class Basquet extends Noticia{
    private String competicio;
    private String club;

    public Basquet(String titular, String competicio, String club) {
        super(titular);
        this.competicio = competicio;
        this.club = club;

        this.preu = calcularPreuNoticia();
    }

    @Override
    public double calcularPreuNoticia(){
        this.preu = 250;

        if(this.competicio.equalsIgnoreCase("eurolliga")){
            this.preu += 75;
        }

        if(this.club.equalsIgnoreCase("barça") || this.club.equalsIgnoreCase("madrid")){
            this.preu += 75;
        }

        return this.preu;
    }
}
