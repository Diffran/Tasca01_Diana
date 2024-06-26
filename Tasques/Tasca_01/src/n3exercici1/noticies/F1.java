package n3exercici1.noticies;

public class F1 extends Noticia{
    private String escuderia;

    public F1(String titular, String escuderia) {
        super(titular);
        this.escuderia = escuderia;

        this.preu = calcularPreuNoticia();
        this.puntuacio = calcularPuntuacioNoticia();
    }

    @Override
    public double calcularPreuNoticia(){
        this.preu = 100;

        if(this.escuderia.equalsIgnoreCase("ferrari") || this.escuderia.equalsIgnoreCase("mercedes")){
            this.preu += 50;
        }

        return this.preu;
    }
    @Override
    public int calcularPuntuacioNoticia(){
        this.puntuacio = 4;

        if(this.escuderia.equalsIgnoreCase("ferrari") || this.escuderia.equalsIgnoreCase("mercedes")){
            this.puntuacio += 2;
        }

        return this.puntuacio;
    }
    @Override
    public void mostrarNot(){
        System.out.println("Titular: "+this.titular);
        System.out.println("Escuderia: "+this.escuderia);
        System.out.println("Text: "+this.text);
        System.out.println("Preu: "+this.preu);
        System.out.println("Puntuacio: "+this.puntuacio);
        System.out.println("____________________________________________________");
    }
}
