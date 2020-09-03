package hangman.model;

public class BonusScore implements GameScore {

	/**
	 * Calcular el puntaje del juego donde se inicía en 0 puntos, se bonifican las
	 * letras correctas con 10 puntos y se penaliza con 5 puntos con cada letra
	 * incorrecta. Por ultimo el puntaje minimo es 0.
	 * 
	 * @param correctCount
	 * @param incorrectCount
	 * @throws HangmanException
	 */
	private int score;

	public BonusScore() {
		score = 0;
	}

	public int calculateScore(int correctCount, int incorrectCount) throws HangmanException {
		if (correctCount < 0 || incorrectCount < 0) {
			throw new HangmanException(HangmanException.INVALID);
		}
		{
			score += correctCount * 10;
			score -= incorrectCount * 5;

			return Math.max(score, 0);
		}
	}
}