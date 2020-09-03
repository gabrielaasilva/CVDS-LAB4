package hangman;
import static org.junit.Assert.assertEquals;

import org.junit.*;

import hangman.model.GameScore;
import hangman.model.HangmanException;
import hangman.model.*;
public class GameScoreTest {
	/**
	Primera clase de equivalencia: ingresa una letra incorrecta en originalScore.
	Resultado: se le restarà diez al puntaje inicial. CORRECTO
	
	Frontera:
	incorrectCount = 10

	**/
	GameScore g;
	@Test
	public void incorrectOriginalScore() {
		int calcula = 0;
		g = new OriginalScore();	
		try {
			calcula = g.calculateScore(0, 1);
			assertEquals(90, calcula);
		} catch (HangmanException e) {
			
		}
	}
	
	/**
	Segunda clase de equivalencia: ingresa una letra incorrecta en BonusScore.
	Resultado: se le restará cinco al puntaje inicial. CORRECTO 

	Frontera:
	incorrectCount = 5
	**/
	
	@Test
	public void incorrectBonusScore() {
		int calcula;
		g = new BonusScore();	
		try {
			calcula = g.calculateScore(1, 1);
			assertEquals(5, calcula);
		} catch (HangmanException e) {
			e.printStackTrace();
		}
	}
	
	

	/**
	tercera clase de equivalencia: ingresa una letra correcta en BonusScore.
	Resultado: se le sumará diez al puntaje inicial. CORRECTO 

	Frontera:
	correctCount = 10
	**/

	@Test
	public void correctBonusScore() {
		int calcula;
		g = new BonusScore();	
		try {
			calcula = g.calculateScore(2, 0);
			assertEquals(20, calcula);
		} catch (HangmanException e) {
			e.printStackTrace();
		}
	}
	
	/**
	cuarta clase de equivalencia: ingresa una letra incorrecta en PowerBonusScore:.
	Resultado: se le restará ocho al puntaje inicial. CORRECTO 

	Frontera:
	incorrectCount = 8
	**/
	
	@Test
	public void incorrectPowerBonusScore() {
		int calcula;
		g = new PowerBonusScore();	
		try {
			calcula = g.calculateScore(2, 1);
			assertEquals(22, calcula);
		} catch (HangmanException e) {
			e.printStackTrace();
		}
	}
	
	/**
	Quinta clase de equivalencia: ingresa una letra correcta en PowerBonusScore:.
	Resultado: se le sumará cinco al puntaje inicial. CORRECTO 

	Frontera:
	correctCount = 5
	**/
	
	@Test
	public void correctPowerBonusScore() {
		int calcula;
		g = new PowerBonusScore();	
		try {
			calcula = g.calculateScore(1, 0);
			assertEquals(5, calcula);
		} catch (HangmanException e) {
			e.printStackTrace();
		}
	}
	/**
	 *Sexta clase de equivalencia : se ingresa un valor negativo en OriginalScore
	 *Resultado: Excepción  
	 **/
	
	@Test
	public void invalidOriginalScore() {
		g =new  OriginalScore();
		try {
			g.calculateScore(-5, -2);
		} catch (HangmanException e) {
			// TODO Auto-generated catch block
			assertEquals(e.getMessage(), HangmanException.INVALID);
		}
	}
	
	/**
	 *Septima clase de equivalencia : se ingresa un valor negativo en BonusScore
	 *Resultado: Excepción  
	 **/
	
	@Test
	public void invalidBonusScore() {
		g =new  BonusScore();
		try {
			g.calculateScore(-5, -2);
		} catch (HangmanException e) {
			// TODO Auto-generated catch block
			assertEquals(e.getMessage(), HangmanException.INVALID);
		}
	}
	
	/**
	 *Octava clase de equivalencia : se ingresa un valor negativo en PowerBonusScore
	 *Resultado: Excepción  
	 **/
	
	@Test
	public void invalidPowerBonusScore() {
		g =new  PowerBonusScore();
		try {
			g.calculateScore(-5, -2);
		} catch (HangmanException e) {
			// TODO Auto-generated catch block
			assertEquals(e.getMessage(), HangmanException.INVALID);
		}
	}
	
}
