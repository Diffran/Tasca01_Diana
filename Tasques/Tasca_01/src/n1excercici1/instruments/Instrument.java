package n1excercici1.instruments;

public abstract class Instrument {
    protected  String nom;
    protected float preu;

    public Instrument(String nom, float preu) {
        this.nom = nom;
        this.preu = preu;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public float getPreu() {
        return preu;
    }
    public void setPreu(float preu) {
        this.preu = preu;
    }

    static{
        System.out.println("Carrega de la classe instrument");
    }

    public abstract void tocar();
}
