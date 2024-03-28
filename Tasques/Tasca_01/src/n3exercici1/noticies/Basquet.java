package n3exercici1.noticies;

public class Basquet extends Noticia{
    private String competicio;
    private String club;

    public Basquet(String titular, String competicio, String club) {
        super(titular);
        this.competicio = competicio;
        this.club = club;

        this.preu = calcularPreuNoticia();
        this.puntuacio = calcularPuntuacioNoticia();
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
    @Override
    public int calcularPuntuacioNoticia(){
        this.puntuacio = 4;

        if(this.competicio.equalsIgnoreCase("eurolliga")){
            this.puntuacio += 3;
        }
        if(this.competicio.equalsIgnoreCase("acb")){
            this.puntuacio += 2;
        }

        if(this.club.equalsIgnoreCase("barça") || this.club.equalsIgnoreCase("madrid")){
            this.puntuacio += 1;
        }

        return this.puntuacio;
    }
    @Override
    public void mostrarNot(){
        System.out.println("Titular: "+this.titular);
        System.out.println("Competicio: "+this.competicio);
        System.out.println("Club: "+this.club);
        System.out.println("Text: "+this.text);
        System.out.println("Preu: "+this.preu);
        System.out.println("Puntuacio: "+this.puntuacio);
        System.out.println("____________________________________________________");
    }
}
