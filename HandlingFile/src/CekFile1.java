
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


/**
 *
 * @author edi
 */
public class CekFile1 {
    
    public static void main(String[] args) {
        
        Path file = Paths.get("src/Halo.txt");
        if (!Files.exists(file)) {
            System.out.println("File tidak ditemukan.");
        } else if (!Files.isReadable(file)) {
            System.out.println("File tidak bisa dibaca.");
        } else {
            System.out.println("File siap diproses.");
        }
    }
}
