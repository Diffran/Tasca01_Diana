package n3exercici1.noticies;

public abstract class Noticia {
    protected String titular;
    protected String text;
    protected int puntuacio;
    protected double preu;

    public Noticia(String titular, int puntuacio, double preu) {
        this.titular = titular;
        this.text = "";
        this.puntuacio = puntuacio;
        this.preu = preu;
    }

    public abstract double calcularPreuNoticia(Noticia noticia);
}
