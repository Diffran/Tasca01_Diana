package n1excersisi3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static final String LINEA = "________________________________________________________________";

    public static void main(String[] args) {
       Scanner lectorUsu = new Scanner(System.in);
       HashMap<String, String> llistatCountries = new HashMap<>();
       Random aleatori = new Random();
       Set<Integer> repetits = new HashSet<>();
           
       String linea, valor, nomUsuari, rutaRelativa, resposta;
       String[] partsLinea = new String[2];
       int punts = 0, indexAleatori, contador = 0, index = 0;;
       
       //file del arxiu per llegir
       rutaRelativa = "Tasca01_Diana/Tasca_01/dades/countries.txt";
       File countries = new File (rutaRelativa);

       //file del arxiu per escriure
       rutaRelativa = "Tasca01_Diana/Tasca_01/dades/classificacio.txt";
       File puntuacio = new File(rutaRelativa);
       
      
       //Passar el file al HashMap----------------------------------------------
       try{   
          BufferedReader lector = new BufferedReader(new FileReader(countries.getAbsolutePath()));
          //llegir el document
          while((linea = lector.readLine()) != null){
              partsLinea = linea.split(" ");
              llistatCountries.put(partsLinea[0], partsLinea[1]);
          }
          lector.close();
       }catch(IOException e){
           System.out.println("Error: "+e.getMessage());
       }
       
      //demanar al usuari les seves dades
      System.out.println("introdueixi el seu nom d'usuari: ");
      nomUsuari = lectorUsu.nextLine();
      
      //comença a mostrar de forma aleatoria 
       System.out.println(LINEA);
       System.out.println("\t\tENTRA LES CAPITALS");
       System.out.println(LINEA);
       
       //Comença el bucle per treure de manera aleatoria els paisos
       while(contador < 51){
           //escull un número aleatori que no s'hagi repetit
            indexAleatori = aleatori.nextInt(llistatCountries.size());
            
            while(repetits.contains(indexAleatori)){
                indexAleatori = aleatori.nextInt(llistatCountries.size());
            }
           repetits.add(indexAleatori);
            //si no el conté imprimeix a pantalla el pais a l'index escullit i espera l'entrada de dades del Usu
            for (HashMap.Entry<String, String> entrada : llistatCountries.entrySet()) {
                if (index == indexAleatori) {
                    System.out.println(entrada.getKey()+": ");
                    
                    //recollir la resposta del Usuari
                    resposta = lectorUsu.nextLine();
                    
                    //comporvar si es correcta, sumar punts si ho és
                    if(entrada.getValue().equalsIgnoreCase(resposta)){
                        System.out.println("Correcte!");
                        punts++;
                    }else{
                        System.out.println("Incorrecte!");
                    } 
                }
                index++;
            }
            index=0;//reiniciar per les seguents preguntes
            contador++;
       }       
       
       //diu a pantalla l'usuari i la puntuació
       System.out.println(LINEA);
       System.out.println("\t\tPUNTUACIÓ");
       System.out.println(LINEA);
       System.out.println(nomUsuari + "---> "+ punts);
       
       //Escriure el nom Usuari i la puntuació----------------------------------
       try(FileWriter escriptor = new FileWriter(puntuacio.getAbsolutePath(), true)){
           nomUsuari = nomUsuari + " " + punts + "\n";
           escriptor.write(nomUsuari);
       }catch(IOException e){
           System.out.println("Error: "+e.getMessage());
       }    
    }
}
