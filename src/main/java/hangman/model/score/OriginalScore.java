package hangman.model.score;

/**
 *
 * @author Ana Salazar
 * @author Richard Urrea
 * 
 * La clase utiliza un tipo de cálculo simple para el puntaje, partiendo del puntaje inicial
 */

public class OriginalScore implements GameScore {

	public static final int PUNTAJE_INICIAL = 100;
	
	/**
	 * {@inheritDoc}
	 * @pre 100
	 * @pos 100 - incorrectCount * 10
	 * @pos return>0
	 *
	 */
	@Override
	public int calculateScore(int correctCount, int incorrectCount) throws IllegalArgumentException {
		if (correctCount < 0 || incorrectCount < 0) throw new IllegalArgumentException();
		return Math.max(OriginalScore.PUNTAJE_INICIAL - 10*incorrectCount, 0);
	}

}
