package n3exercici1;

import n3exercici1.noticies.Futbol;
import n3exercici1.noticies.Noticia;
import n3exercici1.redactor.Redactor;

import java.util.*;

public class Main {
    public static Scanner lector = new Scanner(System.in);
    public static List<Redactor> llistatRedactors = new ArrayList<>();
    public static Map<Redactor, Noticia> llistatNoticies = new HashMap<>();
    public static void main(String[] args) {
        //Futbol n1fut = new Futbol("Hola","Lliga de campions", "Barça", "benzema");
        //System.out.println(n1fut.getPreu());
        int opcio=0;

        do{
            opcio= mostrarMenu();

            switch (opcio){
                case 1:
                    introduirRed();
                    break;
                case 2:
                    eliminarRed();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                default:
                    System.out.println("entra una opcio del 1 al 8");
            }

        }while(opcio != 8);
    }

    public static int mostrarMenu(){
        int opcio=0;

        System.out.println("--------------------MENU--------------------------");
        System.out.println("1.- Introduir redactor.");
        System.out.println("2.- Eliminar redactor.");
        System.out.println("3.- Introduir notícia a un redactor.");
        System.out.println("4.- Eliminar notícia (ha de demanar redactor i titular de la notícia).");
        System.out.println("5.- Mostrar totes les notícies per redactor.");
        System.out.println("6.- Calcular puntuació de la notícia.");
        System.out.println("7.- Calcular preu-notícia.");
        System.out.println("8.- Sortir.");

        try{
           opcio = lector.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Entra un valor tipus integral");
        }
        return opcio;
    }
    public static int mostrarTipusNot(){
        int opcio=0;

        System.out.println("--------------TIPUS DE NOTICIA---------------");
        System.out.println("introdueix tipus de noticia:");
        System.out.println("1.-Futbol");
        System.out.println("2.-Basquet");
        System.out.println("3.-Tenis");
        System.out.println("4.-F1");
        System.out.println("5.-Motociclisme");

        try{
            opcio = lector.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Entra un valor tipus integral");
        }
        return opcio;
    }
    public static Redactor introduirRed(){
        String nom, dni;
        System.out.println("introdueix el nom: ");
        nom = lector.nextLine();
        System.out.println("introdueix el dni");
        dni = lector.nextLine();
        Redactor r = new Redactor(nom, dni);

        return r;
    }
    public static void eliminarRed(){
        boolean eliminat = false;
        String dniRed;

        System.out.println("introdueix el dni del redactor a eliminar: ");
        dniRed = lector.nextLine();

        for(Redactor redactor : llistatRedactors){
            if(redactor.getDni().equalsIgnoreCase(dniRed)){
                llistatRedactors.remove(redactor);
                System.out.println("redactor eliminat correctament");
                eliminat = true;
            }
        }

        if(!eliminat){
            System.out.println("el redactor NO s'ha eliminat perque no s'ha trobat" +
                    "cap redactor amb aquest dni");
        }
    }
    public static void introduirNot(){
        boolean existeix = false;
        String dniRed;

        System.out.println("introdueix el dni del redactor: ");
        dniRed = lector.nextLine();

        for(Redactor redactor : llistatRedactors){
            if(redactor.getDni().equalsIgnoreCase(dniRed)){
                existeix = true;
                redactor.noticies.add(crearNot());
            }
        }

        if(!existeix){
            System.out.println("No s'ha trobat cap redactor amb aquest dni");
        }
    }
    public static Noticia crearNot(){
        int opcio = mostrarMenu();
        String

        switch(opcio){
            case 1:
                System.out.println("Futbol");

                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                System.out.println("opcio no vàlida");
        }

    }


}


