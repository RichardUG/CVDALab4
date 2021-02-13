package hangman.model.score;

/**
 *
 * @author Ana Salazar
 * @author Richard Urrea
 * 
 * La clase realiza un cálculo simple del puntaje, basándose únicamente en los valores correctos e incorrectos
 */

public class BonusScore implements GameScore {

	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int calculateScore(int correctCount, int incorrectCount) throws IllegalArgumentException {

		return 0;
	}

}
