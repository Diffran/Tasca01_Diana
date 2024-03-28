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
    @Override
    public int calcularPuntuacioNoticia(){
        this.puntuacio = 5;

        if(this.competicio.equalsIgnoreCase("lliga de campions")){
            this.puntuacio += 3;
        }
        if(this.competicio.equalsIgnoreCase("lliga")){
            this.puntuacio += 2;
        }

        if(this.club.equalsIgnoreCase("barça") || this.club.equalsIgnoreCase("madrid")){
            this.puntuacio += 1;
        }

        if(this.jugador.equalsIgnoreCase("ferran torres") || this.jugador.equalsIgnoreCase("benzema")){
            this.puntuacio += 1;
        }
        return this.puntuacio;

    }
    @Override
    public void mostrarNot(){
        System.out.println("Titular: "+this.titular);
        System.out.println("Competicio: "+this.competicio);
        System.out.println("Club: "+this.club);
        System.out.println("Jugador: "+this.jugador);
        System.out.println("Text: "+this.text);
        System.out.println("Preu: "+this.preu);
        System.out.println("Puntuacio: "+this.puntuacio);
    }
}
