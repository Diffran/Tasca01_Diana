package n1excersici1.botiga;

public class Venda {
    private Producte[] productes;
    private float preuTotal;
    
    public Venda(Producte[] productes){
        this.productes = productes;
        calcularTotal();
    }
//metodes accessors
    public Producte[] getProductes() {
        return productes;
    }
    public float getPreuTotal() {
        return preuTotal;
    }
    public void setPreuTotal(float preuTotal) {
        this.preuTotal = preuTotal;
    }
    //aquest metode sera cridat al constructor i inicilitzara latribut preuTotal
    public void calcularTotal(){
        float suma=0;
        for(int i=0; i<getProductes().length; i++){
            suma += getProductes()[i].getPreu();
        }
        //em dona el total i li dono el valor al atribut de la classe
        setPreuTotal(suma);
    }
}
