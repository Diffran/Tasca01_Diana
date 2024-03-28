package n3exercici1.noticies;

public abstract class Noticia {
    protected String titular;
    protected String text;
    protected int puntuacio;
    protected double preu;

    public Noticia(String titular) {
        this.titular = titular;
        this.text = "";
    }

    public double getPreu() {
        return preu;
    }

    public String getTitular() {
        return titular;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public abstract double calcularPreuNoticia();
    public  abstract int calcularPuntuacioNoticia();
    public abstract void mostrarNot();
}
