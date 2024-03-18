package n1excercici1.botiga;

public class Producte {
    private String nom;
    private float preu;

    public Producte(String nom, float preu) {
        this.nom = nom;
        this.preu = preu;
    }
    //només el getter de preu perque es lunic que utilitzare
    public float getPreu() {
        return preu;
    }
    public String getNom() {
        return nom;
    }
}
