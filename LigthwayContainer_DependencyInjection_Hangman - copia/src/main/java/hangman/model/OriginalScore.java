package hangman.model;

public class OriginalScore implements GameScore {
	/**
	 * Calcular el puntaje del juego en el esquema original, en la que no se
	 * bonifican las letras correctas y se penaliza con 10 puntos con cada letra
	 * incorrecta. Por ultimo el puntaje minimo es 0.
	 * 
	 * @param correctCount
	 * @param incorrectCount
	 * @throws HangmanException
	 */

	public OriginalScore() {
	}

	public int calculateScore(int correctCount, int incorrectCount) throws HangmanException {
		int score;
		if (correctCount < 0 || incorrectCount < 0) {
			throw new HangmanException(HangmanException.INVALID);
		}

		score = 100 - (incorrectCount * 10);

		return Math.max(score, 0);
	}
}
