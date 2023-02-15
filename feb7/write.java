import java.io.FileWriter;
import java.io.IOException;
public class write {
        public static void main(String[] args) {
            try {
                FileWriter w = new FileWriter("h.txt");
                w.write("this is program to perform file writing\n");
                w.write("I am studying in AI & ML 3rd Sem Diploma\n");
                w.append("\n vishwa");
                w.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
 
}