package n1excercici3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static final String LINEA = "________________________________________________________________";

    public static void main(String[] args) {
       Scanner lectorUsu = new Scanner(System.in);
       HashMap<String, String> llistatCountries = new HashMap<>();
       Random aleatori = new Random();
       Set<Integer> repetits = new HashSet<>();
           
       String linea, nomUsuari, rutaRelativa, resposta;
       String[] partsLinea = new String[2];
       int punts = 0, indexAleatori, contador = 0, index = 0;;
       

       rutaRelativa = "Tasques"+ File.separator+"dades"+File.separator+"countries.txt";
       File countries = new File (System.getProperty("user.dir"),rutaRelativa);


       rutaRelativa = "Tasques"+ File.separator+"dades"+File.separator+"classificacio.txt";
       File puntuacio = new File(System.getProperty("user.dir"),rutaRelativa);

      
       //Passar el file al HashMap----------------------------------------------
       try{   
          BufferedReader lector = new BufferedReader(new FileReader(countries.getAbsolutePath()));

          while((linea = lector.readLine()) != null){
              partsLinea = linea.split(" ");
              llistatCountries.put(partsLinea[0], partsLinea[1]);
          }
          lector.close();
       }catch(IOException e){
           System.out.println("Error: "+e.getMessage());
       }
       

      System.out.println("introdueixi el seu nom d'usuari: ");
      nomUsuari = lectorUsu.nextLine();


       System.out.println(LINEA);
       System.out.println("\t\tENTRA LES CAPITALS");
       System.out.println(LINEA);
       

       while(contador < 10){
           //escull un número aleatori que no s'hagi repetit
            indexAleatori = aleatori.nextInt(llistatCountries.size());
            
            while(repetits.contains(indexAleatori)){
                indexAleatori = aleatori.nextInt(llistatCountries.size());
            }
           repetits.add(indexAleatori);

            for (HashMap.Entry<String, String> entrada : llistatCountries.entrySet()) {
                if (index == indexAleatori) {
                    System.out.println(entrada.getKey()+": ");
                    

                    resposta = lectorUsu.nextLine();
                    

                    if(entrada.getValue().equalsIgnoreCase(resposta)){
                        System.out.println("Correcte!");
                        punts++;
                    }else{
                        System.out.println("Incorrecte!");
                    } 
                }
                index++;
            }
            index=0;
            contador++;
       }       
       

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
