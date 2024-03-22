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
}
