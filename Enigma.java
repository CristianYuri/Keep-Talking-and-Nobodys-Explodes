/*Disciplina: Programação Orientada a Objetos
 *  Professor: Marcel Hugo
 * 
 *  Equipe 10
 *  Marcella Coelho Brito Nunes
 *  Lorena Ricardo de Oliveira
 *  Cristian Yuri Machota
 *  
 *  Data: 22/11/2020
 */
public abstract class Enigma {
	private int puzzleValue;
	public int getPuzzleValue() {
		return puzzleValue;
	}

	public void setPuzzleValue(int puzzleValue) {
		this.puzzleValue = puzzleValue;
	}
	public abstract void puzzleType();

	
}
