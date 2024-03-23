package n3exercici1;

import n3exercici1.noticies.*;
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
                    llistatRedactors.add(introduirRed());
                    break;
                case 2:
                    eliminarRed();
                    break;
                case 3:
                    introduirNot();
                    break;
                case 4:
                    eliminarNot();
                    break;
                case 5:
                    mostrarLlistatNot();
                    break;
                case 6:
                    puntuacioNot();
                    break;
                case 7:
                    preuNot();
                    break;
                case 8:
                    break;
                default:
                    System.out.println("entra una opcio del 1 al 8");
            }

        }while(opcio != 8);
    }

    public static int mostrarMenu(){
        int opcio= 0;

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
           lector.nextLine();
        }catch(InputMismatchException e){
            System.out.println("Entra un valor tipus integral");
        }
        return opcio;
    }
    public static int mostrarTipusNot(){
        int opcio=0;

        System.out.println("--------------TIPUS DE NOTICIA---------------");
        System.out.println("1.-Futbol");
        System.out.println("2.-Basquet");
        System.out.println("3.-Tenis");
        System.out.println("4.-F1");
        System.out.println("5.-Motociclisme");
        System.out.println("introdueix tipus de noticia:");

        try{
            opcio = lector.nextInt();
            lector.nextLine();
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
                    " cap redactor amb aquest dni");
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
                System.out.println("s'ha introduit correctament la noticia en el redator: "+dniRed);
            }
        }

        if(!existeix){
            System.out.println("No s'ha trobat cap redactor amb aquest dni");
        }
    }
    public static Noticia crearNot(){
        Noticia noticia;
        boolean opcioInvalida;
        do {
            opcioInvalida = false;
            int opcio = mostrarTipusNot();
            String titular, competicio, club, jugador, tenista, escuderia, equip;

            switch (opcio) {
                case 1:
                    System.out.println("Futbol");
                    System.out.println("titular noticia: ");
                    titular = lector.nextLine();
                    System.out.println("competicio: ");
                    competicio = lector.nextLine();
                    System.out.println("club: ");
                    club = lector.nextLine();
                    System.out.println("jugador: ");
                    jugador = lector.nextLine();

                    return noticia = new Futbol(titular, competicio, club, jugador);
                case 2:
                    System.out.println("Basquet");
                    System.out.println("titular noticia: ");
                    titular = lector.nextLine();
                    System.out.println("competicio: ");
                    competicio = lector.nextLine();
                    System.out.println("club: ");
                    club = lector.nextLine();

                    return noticia = new Basquet(titular,competicio,club);
                case 3:
                    System.out.println("Tenis");
                    System.out.println("titular noticia: ");
                    titular = lector.nextLine();
                    System.out.println("competicio: ");
                    competicio = lector.nextLine();
                    System.out.println("tenista: ");
                    tenista = lector.nextLine();

                    return noticia = new Tenis(titular,competicio,tenista);
                case 4:
                    System.out.println("F1");
                    System.out.println("titular noticia: ");
                    titular = lector.nextLine();
                    System.out.println("escuderia: ");
                    escuderia = lector.nextLine();

                    return noticia = new F1(titular, escuderia);
                case 5:
                    System.out.println("Motociclisme");
                    System.out.println("titular noticia: ");
                    titular = lector.nextLine();
                    System.out.println("equip: ");
                    equip = lector.nextLine();

                    return noticia= new Motociclisme(titular, equip);
                default:
                    System.out.println("opcio no vàlida");
                    opcioInvalida = true;
            }
        }while(opcioInvalida);
        return noticia = new Futbol(null,null,null,null);
    }
    public static void eliminarNot(){
        boolean existeix = false;
        String dniRed, titular;

        System.out.println("introdueix el dni del redactor: ");
        dniRed = lector.nextLine();

        for(Redactor redactor : llistatRedactors){
            if(redactor.getDni().equalsIgnoreCase(dniRed)){
                existeix = true;
                System.out.println("introdueix el titular de la noticia: ");
                titular = lector.nextLine();
                for(Noticia noticia : redactor.noticies){
                     if(noticia.getTitular().equalsIgnoreCase(titular)){
                         redactor.noticies.remove(noticia);
                         System.out.println("noticia eliminada correctament");
                     }
                }
            }
        }

        if(!existeix){
            System.out.println("No s'ha trobat cap redactor amb aquest dni");
        }
    }
    public static void mostrarLlistatNot(){
        boolean existeix = false;
        String dniRed;

        System.out.println("introdueix el dni del redactor: ");
        dniRed = lector.nextLine();

        for(Redactor redactor : llistatRedactors){
            if(redactor.getDni().equalsIgnoreCase(dniRed)){
                existeix = true;
                for(Noticia noticia : redactor.noticies){
                    noticia.mostrarNot();
                }
            }
        }

        if(!existeix){
            System.out.println("No s'ha trobat cap redactor amb aquest dni");
        }
    }
    public static void puntuacioNot(){
        boolean existeix = false, existeixNot = false;
        String dniRed, titular;

        System.out.println("introdueix el dni del redactor: ");
        dniRed = lector.nextLine();

        for(Redactor redactor : llistatRedactors){
            if(redactor.getDni().equalsIgnoreCase(dniRed)){
                existeix = true;
                System.out.println("introdueix el titular de la noticia: ");
                titular = lector.nextLine();
                for(Noticia noticia : redactor.noticies){
                    if(noticia.getTitular().equalsIgnoreCase(titular)){
                        System.out.println("puntuacio noticia-"+titular+": "+noticia.getPuntuacio());
                        existeixNot = true;
                    }
                }
                if(!existeixNot){
                    System.out.println("no existeix cap noticia amb aquest titular");
                }
            }
        }

        if(!existeix){
            System.out.println("No s'ha trobat cap redactor amb aquest dni");
        }
    }
    public static void preuNot(){
        boolean existeix = false, existeixNot = false;
        String dniRed, titular;

        System.out.println("introdueix el dni del redactor: ");
        dniRed = lector.nextLine();

        for(Redactor redactor : llistatRedactors){
            if(redactor.getDni().equalsIgnoreCase(dniRed)){
                existeix = true;
                System.out.println("introdueix el titular de la noticia: ");
                titular = lector.nextLine();
                for(Noticia noticia : redactor.noticies){
                    if(noticia.getTitular().equalsIgnoreCase(titular)){
                        System.out.println("preu noticia-"+titular+": "+noticia.getPreu()+"€");
                    }
                }
               if(!existeix){
                   System.out.println("no existeix cap noticia amb aquest titular");
               }
            }
        }

        if(!existeix){
            System.out.println("No s'ha trobat cap redactor amb aquest dni");
        }
    }


}


