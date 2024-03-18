package n1exercici2.pack;

public class Treballador {
    protected String nom;
    protected String cognom;
    protected double preuHora;

    public Treballador(String nom, String cognom, double preuHora) {
        this.nom = nom;
        this.cognom = cognom;
        this.preuHora = preuHora;
    }

    public double calcularSou(double hores){
        return this.preuHora*hores;
    };
}
