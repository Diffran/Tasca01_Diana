package n3exercici1.noticies;

public class F1 extends Noticia{
    private String escuderia;

    public F1(String titular, String escuderia) {
        super(titular);
        this.escuderia = escuderia;

        this.preu = calcularPreuNoticia();
    }

    @Override
    public double calcularPreuNoticia(){
        this.preu = 100;

        if(this.escuderia.equalsIgnoreCase("ferrari") || this.escuderia.equalsIgnoreCase("mercedes")){
            this.preu += 50;
        }

        return this.preu;
    }
}
