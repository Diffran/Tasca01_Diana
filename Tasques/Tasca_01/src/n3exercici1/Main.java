package n3exercici1;

import n3exercici1.noticies.*;
import n3exercici1.redactor.Redactor;

import java.util.*;

public class Main {
    public static Scanner lector = new Scanner(System.in);
    public static List<Redactor> llistatRedactors = new ArrayList<>();
    public static Map<Redactor, Noticia> llistatNoticies = new HashMap<>();

    public static void main(String[] args) {
        int opcio = 0;

        do {
            opcio = mostrarMenu();

            switch (opcio) {
                case 1:
                    introduirRed();
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
                    mostrarLlistatRed();
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

        } while (opcio != 8);
    }

    public static int mostrarMenu() {
        int opcio = 0;

        System.out.println("--------------------MENU--------------------------");
        System.out.println("1.- Introduir redactor.");
        System.out.println("2.- Eliminar redactor.");
        System.out.println("3.- Introduir notícia a un redactor.");
        System.out.println("4.- Eliminar notícia (ha de demanar redactor i titular de la notícia).");
        System.out.println("5.- Mostrar totes les notícies per redactor.");
        System.out.println("6.- Calcular puntuació de la notícia.");
        System.out.println("7.- Calcular preu-notícia.");
        System.out.println("8.- Sortir.");

        try {
            opcio = lector.nextInt();
            lector.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Entra un valor tipus integral");
        }
        return opcio;
    }
    public static int mostrarTipusNot() {
        int opcio = 0;

        System.out.println("--------------TIPUS DE NOTICIA---------------");
        System.out.println("1.-Futbol");
        System.out.println("2.-Basquet");
        System.out.println("3.-Tenis");
        System.out.println("4.-F1");
        System.out.println("5.-Motociclisme");
        System.out.println("introdueix tipus de noticia:");

        try {
            opcio = lector.nextInt();
            lector.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Entra un valor tipus integral");
        }
        return opcio;
    }

    public static void introduirRed() {
        String nom, dni;
        System.out.println("introdueix el nom: ");
        nom = lector.nextLine();
        System.out.println("introdueix el dni");
        dni = lector.nextLine();
        Redactor r = new Redactor(nom, dni);

        llistatRedactors.add(r);
    }
    public static void eliminarRed() {
        boolean eliminat = false;
        Redactor redactor = buscarRed();

        if(redactor==null){
            System.out.println("no s'ha trobat cap redactor amb aquest dni");
        }else{
            eliminat=llistatRedactors.remove(redactor);
        }
        if (!eliminat) {
            System.out.println("el redactor NO s'ha eliminat");
        }else{
            System.out.println("redactor eliminat correctament");
        }
    }
    public static void introduirNot() {
        boolean existeix = false;
        Redactor redactor = buscarRed();
        Noticia noticia;

        if(redactor==null){
            System.out.println("no s'ha trobat cap redactor amb aquest dni");
        }else{
            noticia = crearNot();
            if(noticia == null){
                System.out.println("no s'ha pogut crear correctament la noticia");
            }else {
                existeix=redactor.noticies.add(noticia);
            }

            if(!existeix){
                System.out.println("no s'ha pogut afegir la noticia al llistat del redactor");
            }else {
                System.out.println("noticia introduida correctament");
            }
        }
    }
    public static Noticia crearNot() {
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

                    return noticia = new Basquet(titular, competicio, club);
                case 3:
                    System.out.println("Tenis");
                    System.out.println("titular noticia: ");
                    titular = lector.nextLine();
                    System.out.println("competicio: ");
                    competicio = lector.nextLine();
                    System.out.println("tenista: ");
                    tenista = lector.nextLine();

                    return noticia = new Tenis(titular, competicio, tenista);
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

                    return noticia = new Motociclisme(titular, equip);
                default:
                    System.out.println("opcio no vàlida");
                    opcioInvalida = true;
            }
        } while (opcioInvalida);
        return noticia = null;
    }
    public static void eliminarNot() {
        boolean existeix = false;
        Redactor redactor = buscarRed();
        Noticia noticia = buscarNot(redactor);

        if(noticia == null){
            System.out.println("no s'ha trobat cap noticia amb aquest titular");
        }else{
            existeix=redactor.noticies.remove(noticia);
        }
        if(!existeix){
            System.out.println("no s'ha pogut eliminar la noticia");
        }
    }
    public static void mostrarLlistatRed() {
        Redactor redactor = buscarRed();
        if(redactor == null){
            System.out.println("no s'ha trobat cap redactor amb aquest dni");
        }else{
            for(Noticia not: redactor.noticies){
                not.mostrarNot();
            }
        }
    }
    public static void puntuacioNot() {
        Noticia noticia = buscarNot(buscarRed());

        if(noticia == null){
            System.out.println("no s'ha trobat la noticia");
        }else{
            System.out.println("Puntuacio: " + noticia.getPuntuacio());
        }
    }
    public static void preuNot() {
        Noticia noticia = buscarNot(buscarRed());

        if(noticia == null){
            System.out.println("no s'ha trobat la noticia");
        }else{
            System.out.println("Preu: " + noticia.getPreu());
        }
    }

    public static Redactor buscarRed() {
        String dni;
        Redactor red;
        System.out.println("entra el dni del redactor: ");
        dni = lector.nextLine();
        for (Redactor redactor : llistatRedactors) {
            if (redactor.getDni().equalsIgnoreCase(dni)) {
                return redactor;
            }
        }
        return red = null;
    }
    public static Noticia buscarNot(Redactor redactor) {
        Noticia not = null;
        String titular;
        if (redactor == null) {
            System.out.println("no s'ha trobat cap redactor amb aquest dni");
            return not;
        }
        System.out.println("entra el titular de la noticia: ");
        titular = lector.nextLine();
        for (Noticia noticia : redactor.noticies) {
            if (noticia.getTitular().equalsIgnoreCase(titular)) {
                return not;
            }
        }
        return not = null;
    }

}


