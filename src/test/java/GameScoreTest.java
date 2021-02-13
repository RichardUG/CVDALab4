import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;
import hangman.model.score.*;

public class GameScoreTest {
	private OriginalScore original = new OriginalScore();
	private BonusScore bonus = new BonusScore();
	private PowerScore power = new PowerScore();
	//Caso 1 clase de equivalencia OriginalScore
	@Test
	public void validarCorrectoOriginalScore(){
		int puntaje=original.calculateScore(2,7);
		Assert.assertEquals(30,puntaje);
	}
	//Caso 2 clase de equivalencia OriginalScore y caso 5 de limite de frontera OriginalScore
	@Test
	public void incorrectCountMayor10OriginalScore(){
		int puntaje=original.calculateScore(2,15);
		Assert.assertEquals(0,puntaje);
	}
	//Caso 1 limite de frontera OriginalScore
	@Test
	public void correctCountIgual0OriginalScore(){
		int puntaje=original.calculateScore(0,7);
		Assert.assertEquals(30,puntaje);
	}
	//Caso 2 limite de frontera OriginalScore
	@Test
	public void correctCountMenor0OriginalScore(){
		try{
			int puntaje=original.calculateScore(-1,7);
			Assert.fail();
		}
		catch (Exception ex) {}
	}
	//Caso 3 limite de frontera OriginalScore
	@Test
	public void incorrectCountIgual0OriginalScore(){
		int puntaje=original.calculateScore(2,0);
		Assert.assertEquals(100,puntaje);
	}
	//Caso 4 limite de frontera OriginalScore
	@Test
	public void incorrectCountMenor0OriginalScore(){
		try {
			int puntaje = original.calculateScore(2, -1);
			Assert.fail();
		}
		catch (Exception ex){}
	}
	//Caso 1 clase de equivalencia BonusScore
	@Test
	public void validarCorrectoBonusScore(){
		int puntaje=bonus.calculateScore(8,2);
		Assert.assertEquals(70,puntaje);
	}
	//Caso 2 clase de equivalencia BonusScore y caso 5 de limite de frontera BonusScore
	@Test
	public void incorrectCountMayorCorrectCountBonusScore(){
		int puntaje=bonus.calculateScore(2,15);
		Assert.assertEquals(0,puntaje);
	}
	//Caso 1 limite de frontera BonusScore
	@Test
	public void correctCountIgual0BonusScore(){
		int puntaje=bonus.calculateScore(0,7);
		Assert.assertEquals(0,puntaje);
	}
	//Caso 2 limite de frontera BonusScore
	@Test
	public void correctCountMenor0BonusScore(){
		try{
			int puntaje=bonus.calculateScore(-1,7);
			Assert.assertEquals("IllegalArgumentException",puntaje);
			Assert.fail();
		}
		catch (Exception ex){}
	}
	//Caso 3 limite de frontera BonusScore
	@Test
	public void incorrectCountIgual0OBonusScore(){
		int puntaje=bonus.calculateScore(2,0);
		Assert.assertEquals(20,puntaje);
	}
	//Caso 4 limite de frontera BonusScore
	@Test
	public void incorrectCountMenor0BonusScore(){
		try {
			int puntaje = bonus.calculateScore(2, -1);
			Assert.assertEquals("IllegalArgumentException", puntaje);
			Assert.fail();
		}
		catch (Exception ex){}
	}
	//Caso 1 clase de equivalencia PowerScore
	@Test
	public void validarCorrectoPowerScore(){
		int puntaje=power.calculateScore(3,2);
		Assert.assertEquals(139,puntaje);
	}
	//Caso 2 clase de equivalencia PowerScore y caso 5 de limite de frontera PowerScore
	@Test
	public void resultadoNoMenorA0PowerScore(){
		int puntaje=power.calculateScore(1,2);
		Assert.assertEquals(0,puntaje);
	}
	//Caso 2 clase de equivalencia PowerScore y caso 6 de limite de frontera PowerScore
	@Test
	public void resultadoNoMayorA500PowerScore(){
		int puntaje=power.calculateScore(6,2);
		Assert.assertEquals(500,puntaje);
	}
	//Caso 1 limite de frontera PowerScore
	@Test
	public void correctCountIgual0PowerScore(){
		int puntaje=power.calculateScore(0,7);
		Assert.assertEquals(0,puntaje);
	}
	//Caso 2 limite de frontera PowerScore
	@Test
	public void correctCountMenor0PowerScore(){
		try {
			int puntaje = power.calculateScore(-1, 7);
			Assert.assertEquals("IllegalArgumentException", puntaje);
			Assert.fail();
		}
		catch (Exception ex){}
	}
	//Caso 3 limite de frontera PowerScore
	@Test
	public void incorrectCountIgual0OPowerScore(){
		int puntaje=power.calculateScore(2,0);
		Assert.assertEquals(30,puntaje);
	}
	//Caso 4 limite de frontera PowerScore
	@Test
	public void incorrectCountMenor0PowerScore(){
		try{
			int puntaje=power.calculateScore(2,-1);
			Assert.assertEquals("IllegalArgumentException",puntaje);
			Assert.fail();
		}
		catch (Exception ex){}
	}

}

