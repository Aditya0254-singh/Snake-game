import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class GameSound {
    public static void play(String filename) {
        try {
            File file = new File(filename);
            if (!file.exists()) return;
            AudioInputStream audio = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException ignored) {
        }
    }
}
