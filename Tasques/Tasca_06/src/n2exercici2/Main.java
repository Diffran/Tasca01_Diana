package n2exercici2;


import n1exercici2.generic.Persona;
import n2exercici2.generic.LlistaIndefinidaArguments;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Leandro","Gastón", 60);
        Persona p2 = new Persona("Juan","Garcia", 40);

        System.out.println("-----------------------MATEIX NUM ARGUMENTS QUE ABANS---------------------------");
        LlistaIndefinidaArguments.metodeLlistaGen(p,"lletres",2);
        System.out.println("--------------------------------------------------");
        System.out.println("-----------DIFERENT TAMANY, MES ARGUMENTS DE QUALSEVOL TIPUS----------");
        LlistaIndefinidaArguments.metodeLlistaGen("lletres",p,2,p2,"Hola",356);
        //només puc canviar l'ordre dels dos primers, l'ultim ha de ser un int
    }
}
