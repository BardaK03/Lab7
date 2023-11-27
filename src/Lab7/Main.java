package Lab7;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        try {
            File myObj = new File(Path.of("").toAbsolutePath()+ "\\filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("EROARE!!!.");
            e.printStackTrace();
        }
    }
}
