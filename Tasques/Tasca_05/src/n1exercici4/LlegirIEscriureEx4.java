package n1exercici4;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Set;
import java.util.TreeSet;

public class LlegirIEscriureEx4 {
    public static void llegirFitxer(String ruta){

        try(BufferedReader lector = new BufferedReader(new FileReader(ruta))){
            String linea;
            while((linea = lector.readLine()) != null){
                System.out.println(linea);
            }
        }catch(IOException e){
            System.out.println("Error: " + e);
        }
    }

    //----------------------------------------------------------------------
    public static void llegirDir(String ruta, String rutaEsciptura){
        Path start = Paths.get(ruta);
        Set<String> fitxersiDirecotis = new TreeSet<>();


        try (BufferedWriter escriptor = new BufferedWriter(new FileWriter(rutaEsciptura))){
            Files.walkFileTree(start, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    escriptor.write(String.valueOf( "[FIT] - " + file.getFileName())+" || "+ Files.getLastModifiedTime(file)+ "\n");
                    return FileVisitResult.CONTINUE;
                }
                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                    escriptor.write("[DIR] - " + dir.getFileName() +" || "+ Files.getLastModifiedTime(dir) + "\n");
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
