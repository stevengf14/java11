package ec.com.learning.java11.files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author Steven Guamán - October 2022
 */
public class File {

    public void read() {
        try {
            String content = Files.readString(Path.of("src\\main\\java\\ec\\com\\learning\\java11\\files\\test.txt"));
            System.out.println(content);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // FIRST TIME -> CREATE FILE AND WRITE
    public void write() {
        try {
            Path path = Files.writeString(Path.of("src\\main\\java\\ec\\com\\learning\\java11\\files\\test.txt"), "From JDK 11", StandardOpenOption.CREATE_NEW);
            System.out.println(path);
            String s = Files.readString(path);
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // OPEN EXISTING FILE AND WRITE
    public void reWrite() {
        try {
            Path path = Files.writeString(Path.of("src\\main\\java\\ec\\com\\learning\\java11\\files\\test.txt"), "New Content", StandardOpenOption.APPEND);
            System.out.println(path);
            String s = Files.readString(path);
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
