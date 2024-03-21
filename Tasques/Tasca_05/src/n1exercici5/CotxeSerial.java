package n1exercici5;

import java.io.Serializable;

public class CotxeSerial implements Serializable {
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
