package n3exercici1.redactor;

import n3exercici1.noticies.Noticia;

import java.util.ArrayList;
import java.util.List;

public class Redactor {
    private String nom;
    private final String dni;
    private static double sou = 1500;

    public List<Noticia> noticies = new ArrayList<>();

    public Redactor(String nom, String dni) {
        this.nom = nom;
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }
}
