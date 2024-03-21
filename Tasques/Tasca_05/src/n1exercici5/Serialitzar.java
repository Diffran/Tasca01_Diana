package n1exercici5;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Set;
import java.util.TreeSet;

public class Serialitzar {

    //SERIALITZACIÓ ->
    public static void serialitzarObj(Object objecte){

        try(ObjectOutputStream serial = new ObjectOutputStream (new FileOutputStream("serial.ser"))){

            serial.writeObject(objecte);
            serial.close();

        }catch(IOException e){
            System.out.println("Error: " + e);
        }
    }

    //DESERIALIZACION -> ObjectInputStream
    public static CotxeSerial deserialitzarObj(String fitxer){
        try (FileInputStream fis = new FileInputStream(fitxer);
             ObjectInputStream ois = new ObjectInputStream(fis)){//no entenc...??

            return (CotxeSerial)ois.readObject();

        }catch(Exception e){
            System.out.println("Error: " + e);
            Object objetoDeserializado = null;
            return (CotxeSerial)objetoDeserializado;
        }

    }


    //------------------------------------------------------------------------------------------------
    public static void llegirFitxer(String ruta){
        //llegir el document
        try(BufferedReader lector = new BufferedReader(new FileReader(ruta))){
            String linea;
            while((linea = lector.readLine()) != null){
                System.out.println(linea);
            }
        }catch(IOException e){
            System.out.println("Error: " + e);
        }
    }

    public static void llegirDir(String ruta, String rutaEsciptura){
        Path start = Paths.get(ruta);
        Set<String> fitxersiDirecotis = new TreeSet<>();


        try (BufferedWriter escriptor = new BufferedWriter(new FileWriter(rutaEsciptura))){
            Files.walkFileTree(start, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    escriptor.write(String.valueOf( "[FIT] - " + file.getFileName())+" || "+ Files.getLastModifiedTime(file).toString() + "\n");
                    return FileVisitResult.CONTINUE;
                }
                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                    escriptor.write("[DIR] - " + dir.getFileName() +" || "+ Files.getLastModifiedTime(dir).toString() + "\n");
                    return FileVisitResult.CONTINUE;
                }

            });

            for (String fitxerODirectori : fitxersiDirecotis) {
                System.out.println(fitxerODirectori);
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
