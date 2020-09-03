package hangman.model;

public class OriginalScore implements GameScore{
	/**
	 * Calcular el puntaje del juego en el esquema original, en la que no se bonifican las letras correctas y se penaliza con 10 puntos con cada letra incorrecta.
	 * Por ultimo el puntaje minimo es 0.
	 *@param correctCount
	 *@param incorrectCount
	 *@throws HangmanException
	 */
	private int score;
	public OriginalScore() {
		score = 100;
	}
	public int calculateScore(int correctCount,int incorrectCount) throws HangmanException {
		if (score > 0) {
			if(correctCount<0 || incorrectCount<0) {throw new HangmanException(HangmanException.INVALID);}
			else {
				score -= (incorrectCount*10);
			}
		}
		return score;
	}
}
