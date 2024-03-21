package n1excercici1.botiga;

public class Venda {
    private Producte[] productes;
    private float preuTotal;
    
    public Venda(Producte[] productes){
        this.productes = productes;
        calcularTotal();
    }

    public Producte[] getProductes() {
        return productes;
    }
    public float getPreuTotal() {
        return preuTotal;
    }
    public void setPreuTotal(float preuTotal) {
        this.preuTotal = preuTotal;
    }

    public void calcularTotal(){
        float suma=0;
        for(int i=0; i<getProductes().length; i++){
            suma += getProductes()[i].getPreu();
        }

        setPreuTotal(suma);
    }
}
