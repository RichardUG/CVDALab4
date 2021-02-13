package hangman.model.score;


/**
 *
 * @author Ana Salazar
 * @author Richard Urrea
 *
 *
 * La clase realiza un cálculo avanzado para el puntaje, utilizando una suma de potencias
 */
public class PowerScore implements GameScore {

	
	/**
	 * {@inheritDoc}
	 * @Pre 0
	 * @Pos sumatoria(5^correctCount) - (incorrectCount*8)
	 * @Pos return>0 return<500
	 */
	@Override
	public int calculateScore(int correctCount, int incorrectCount) throws IllegalArgumentException {

		return 0;
	}

}
