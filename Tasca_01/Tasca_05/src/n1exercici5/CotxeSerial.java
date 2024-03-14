package n1exercici5;

import java.io.Serializable;

public class CotxeSerial implements Serializable {
    //per poder ser serialitzat un objecte ha d'implementar la Serializable
    private String marca;
    private String modelo;
    public CotxeSerial(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }
}
