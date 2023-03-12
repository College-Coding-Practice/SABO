
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author edi
 */
public class CopyFile {
   
    public static void main(String[] args) {
        
        Path file = Paths.get("src/Halo.txt");
        
        if (!Files.exists(file)) {
            System.out.println("File tidak ditemukan.");
        } else if (!Files.isReadable(file)) {
            System.out.println("File tidak bisa dibaca.");
        } else {
            System.out.println("File siap diproses.");
        
            // Copy file
            try {
                Path target = Paths.get("src/Halo-new.txt");
                Files.copy(file, target);
            } catch (DirectoryNotEmptyException ex) {
                System.out.println("Direktori harus dikosongkan terlebih dahulu");
            } catch (IOException ex) {
                System.out.println("Tidak dapat menghapus file: " + file);
            }
        }
    }
}
