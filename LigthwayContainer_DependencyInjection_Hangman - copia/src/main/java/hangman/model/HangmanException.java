package hangman.model;

public class HangmanException extends Exception {
	public static final String INVALID = "Los puntajes no pueden ser negativos";
	public HangmanException(String o) {
		super(o);
	}
	
}
