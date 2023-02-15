import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class reader {
    public static void main(String[] args) {
        try {
            BufferedReader r = new BufferedReader(new FileReader("readf.txt"));
            String line = r.readLine();
            while (line != null) {
                System.out.println(line);
                line = r.readLine();
            }
            r.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
