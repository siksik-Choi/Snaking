package application;

import java.io.IOException;

import com.darkprograms.speech.synthesiser.SynthesiserV2;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;

/**
 * This is where all begins .
 * 
 * @author GOXR3PLUS
 *
 */
public class Trying_Different_Languages {
	
	//Create a Synthesizer instance
	SynthesiserV2 synthesizer = new SynthesiserV2("AIzaSyBOti4mM-6x9WDnZIjIeyEU21OpBXqWBgw");
	
	public Trying_Different_Languages(String line) {
		
		//Let's speak in English
		speak(line);

	}
	
	/**
	 * Calls the MaryTTS to say the given text
	 * 
	 * @param text
	 */
	public void speak(String text) {
		System.out.println(text);
		
		//Create a new Thread because JLayer is running on the current Thread and will make the application to lag
		Thread thread = new Thread(() -> {
			try {
				
				//Create a JLayer instance
				AdvancedPlayer player = new AdvancedPlayer(synthesizer.getMP3Data(text));
				player.play();
				
				//System.out.println("Successfully got back synthesizer data");
				
			} catch (IOException | JavaLayerException e) {
				
				e.printStackTrace(); 
				//Print the exception ( we want to know , not hide below our finger , like many developers do...)
				
			}
		});
		
		//We don't want the application to terminate before this Thread terminates
		thread.setDaemon(false); 	//false가 기본값
		
		//Start the Thread
		thread.start();
		
	}
	
	public static void main(String[] args) {
		//new Trying_Different_Languages("한국어?");
	}
	
}
