
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class DelFile {
    
    public static void main(String[] args) throws IOException {
        
        Path file = Paths.get("src/gofile");
        
        if (!Files.exists(file)) {
            System.out.println("File tidak ditemukan.");
        } else if (!Files.isReadable(file)) {
            System.out.println("File tidak bisa dibaca.");
        } else {
            System.out.println("File siap diproses.");
        // Menghapus file
        try {
            Files.deleteIfExists(file);} catch (DirectoryNotEmptyException ex) {
                System.out.println("Direktori harus dikosongkan terlebih dahulu");
            } catch (IOException ex) {
                System.out.println("Tidak dapat menghapus file: " + file);
            }
        }
    }
}
