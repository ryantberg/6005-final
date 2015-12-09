package abc.player;

import java.io.IOException;

/**
 * Main entry point of your application.
 */
public class Main {

    /**
     * Plays the input file using Java MIDI API and displays
     * header information to the standard output stream.
     * 
     * (Your code should not exit the application abnormally using
     * System.exit().)
     * 
     * @param file the name of input abc file
     */
    public static void play(String file) {
        try {
            Tune.fromFile(file).play();
        } catch (IOException e) {
            System.err.println("Failed to open file: "+e.getMessage());
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: java abc.player.Main <filename>");
            return;
        }
        
        play(args[0]);
    }
}
