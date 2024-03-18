package n1exercici5;

import java.io.Serializable;

public class CotxeSerial implements Serializable {
    //per poder ser serialitzat un objecte ha d'implementar la Serializable
    private String matricula;
    private String model;
    public CotxeSerial(String matricula, String modelo) {
        this.matricula = matricula;
        this.model = modelo;
    }

    public String getMatricula() {
        return matricula;
    }
    public String getModel() {
        return model;
    }
}
