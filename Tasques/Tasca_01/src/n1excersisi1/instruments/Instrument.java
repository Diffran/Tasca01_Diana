package n1excersisi1.instruments;

public abstract class Instrument {
    protected  String nom;
    protected float preu;

    //constructor  que sera heredat
    public Instrument(String nom, float preu) {
        this.nom = nom;
        this.preu = preu;
    }
    //metodes accessors
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

    //metode abstracte que simplementara en les classes filles
    public abstract void tocar();
}
