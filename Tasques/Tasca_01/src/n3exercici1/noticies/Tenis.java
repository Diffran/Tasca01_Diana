package n3exercici1.noticies;

public class Tenis extends Noticia{
    private String competicio;
    private String tenistes;

    public Tenis(String titular, String competicio, String tenistes) {
        super(titular);
        this.competicio = competicio;
        this.tenistes = tenistes;

        this.preu = calcularPreuNoticia();
    }

    @Override
    public double calcularPreuNoticia(){
        this.preu = 150;

        if(this.tenistes.equalsIgnoreCase("federer") || this.tenistes.equalsIgnoreCase("nadal") ||
                this.tenistes.equalsIgnoreCase("djokovic")){
            this.preu += 100;
        }

        return this.preu;
    }

    @Override
    public void mostrarNot(){
        System.out.println("Titular: "+this.titular);
        System.out.println("Competicio: "+this.competicio);
        System.out.println("tenista: "+this.tenistes);
        System.out.println("Text: "+this.text);
        System.out.println("Preu: "+this.preu);
        System.out.println("Puntuacio: "+this.puntuacio);
    }
}
