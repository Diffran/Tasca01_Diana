package n1exercici1;

public abstract class Treballador {
    protected String nom;
    protected String cognom;
    protected double preuHora;

    public Treballador(String nom, String cognom, float preuHora) {
        this.nom = nom;
        this.cognom = cognom;
        this.preuHora = preuHora;
    }

    public double calcularSou(double hores){
        return this.preuHora*hores;
    };
}
