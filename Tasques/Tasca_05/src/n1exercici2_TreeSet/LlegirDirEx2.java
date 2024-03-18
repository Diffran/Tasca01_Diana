package n1exercici2_TreeSet;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Set;
import java.util.TreeSet;

public class LlegirDirEx2 {
    public static void llegirDir(String ruta){
        Path start = Paths.get(ruta);
        Set<String> fitxersiDirecotis = new TreeSet<>();

        try {
            Files.walkFileTree(start, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    fitxersiDirecotis.add(String.valueOf(file.getFileName()) + " [FIT] - " + Files.getLastModifiedTime(file).toString());
                    return FileVisitResult.CONTINUE;
                }
                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                    fitxersiDirecotis.add(dir.getFileName() + " [DIR] - " + Files.getLastModifiedTime(dir).toString());
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
