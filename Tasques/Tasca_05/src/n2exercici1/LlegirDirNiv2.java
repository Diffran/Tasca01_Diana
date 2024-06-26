package n2exercici1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Set;
import java.util.TreeSet;

public class LlegirDirNiv2 {
    public static void llegirDirNiv2(String ruta, String rutaEsciptura){
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
