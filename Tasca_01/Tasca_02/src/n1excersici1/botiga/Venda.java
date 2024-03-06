package n1excersici1.botiga;

public class Venda {
    private Producte[] productes;
    private double preuTotal;

    public Venda(Producte[] productes) {
        this.productes = productes;
        calcularTotal();
    }

    public Producte[] getProductes() {
        return productes;
    }

    public void setProductes(Producte[] productes) {
        this.productes = productes;
    }

    public double getPreuTotal() {
        return preuTotal;
    }

    public void setPreuTotal(double preuTotal) {
        this.preuTotal = preuTotal;
    }

    public void calcularTotal(){
        double suma = 0;
        for(int i=0; i<getProductes().length;i++){
            suma += getProductes()[i].getPreu();
        }
        setPreuTotal(suma);
    }
}
