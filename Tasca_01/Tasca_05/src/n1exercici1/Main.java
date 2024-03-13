package n1exercici1;
import java.io.File;

import static n1exercici1.LlistarAlfaDirectori.llistarDir;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        File dades = new File("C:/Users/formacio/Desktop/Diana_java/Sprint_1/Tasca_01/dades");
        llistarDir(dades);

    }
}