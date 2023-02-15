import java.net.Socket;

import javax.sound.midi.Soundbank;

public class ErrorHandling {
    public static void main(String[] args) {
        try {
            int data=50/0; 
        }

         catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
    
}
