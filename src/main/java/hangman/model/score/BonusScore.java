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
	 * @Pre 0
	 * @Pos (correctCount * 10) - (incorrectCount * 5)
	 * @Pos return>0
	 */
	@Override
	public int calculateScore(int correctCount, int incorrectCount) throws IllegalArgumentException {
		if (correctCount < 0 || incorrectCount < 0) throw new IllegalArgumentException();
		return Math.max(10*correctCount - 5*incorrectCount, 0);
	}

}
