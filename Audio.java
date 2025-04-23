package audio;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Audio {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("C:\\Users\\USER\\OneDrive\\Desktop\\java\\audio\\ALVINANDTHECHIPMUNKS.wav");
        
        AudioInputStream AudioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(AudioStream);
        
        Scanner scanner = new Scanner(System.in);
        String response= "";
        

        while(!response.equals("Q")){
            System.out.println("(P = Play); (S = Stop); (R = Restart); (Q = Quit)");
            System.out.println("Enter a choice: ");
            response = scanner.next().toUpperCase();

            switch(response){
                case("P"):
                    clip.start();
                    break;

                case("S"): 
                    clip.stop();
                    break;

                case("R"): 
                    clip.setMicrosecondPosition(0);
                    break;

                case("Q"): 
                    clip.close();
                    break;
            
                default: 
                    System.out.println("Not a valid choice");
            }

            System.out.println("byeeee");

           
  
        }
        scanner.close();
    }
}
