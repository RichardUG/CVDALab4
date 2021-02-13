package hangman.model.score;


/**
 * 
 * @author Ana Salazar
 * @author Richard Urrea
 * 
 * Interfaz que contienen la lógica de cálculo del puntaje en el sistema.
 *
 */
public interface GameScore {

	/**
	 * Calcula el puntaje dados la cantidad de intentos incorrectos y letras correctas
	 * 
	 * @param correctCount cantidad de letras correctas
	 * @param incorrectCount cantidad de intentos incorrectos
	 * @return puntaje calculado
	 * @throws IllegalArgumentException - si alguno de los parámetros < 0
	 */
	public int calculateScore(int correctCount, int incorrectCount) throws IllegalArgumentException;
	
}
