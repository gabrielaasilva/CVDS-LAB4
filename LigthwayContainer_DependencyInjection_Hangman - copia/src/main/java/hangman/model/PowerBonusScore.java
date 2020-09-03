package hangman.model;

public class PowerBonusScore implements GameScore {

	/**
	 * Calcular el puntaje del juego donde se inicía en 0 puntos, se bonifican las letras correctas con 5 puntos y  se penaliza con 8 puntos con cada letra incorrecta.
	 * Por ultimo el puntaje minimo es 0.
	 *@param correctCount
	 *@param incorrectCount
	 *@throws HangmanException
	 */
	private int score;
	
	public PowerBonusScore() {
		score = 0;
	}
	public int calculateScore(int correctCount,int incorrectCount) throws HangmanException{
		if(score>=0) {
			if(correctCount<0 || incorrectCount<0) {throw new HangmanException(HangmanException.INVALID);}
			else {
				for(int i= 0 ; i<correctCount;i++) {
					score+= Math.pow(5, i+1);
				}
				score = Math.min(score, 500);
				score-= incorrectCount * 8;
				return score;
				}
			}		
		return 0;
	}

}