package hangman.model;

public class PowerBonusScore implements GameScore {

	/**
	 * Calcular el puntaje del juego donde se inicía en 0 puntos, se bonifican las letras correctas con 5 puntos y  se penaliza con 8 puntos con cada letra incorrecta.
	 * Por ultimo el puntaje minimo es 0.
	 *@param correctCount
	 *@param incorrectCount
	 *@throws HangmanException
	 */
	public int calculateScore(int correctCount,int incorrectCount) throws HangmanException{
		return 0;
	}

}