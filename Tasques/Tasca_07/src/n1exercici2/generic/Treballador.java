package n1exercici2.generic;

public abstract class Treballador {
    protected String nom;
    protected String cognom;
    protected double preuHora;

    public Treballador(String nom, String cognom, double preuHora) {
        this.nom = nom;
        this.cognom = cognom;
        this.preuHora = preuHora;
    }

    public abstract double calcularSou(double hores);
}
