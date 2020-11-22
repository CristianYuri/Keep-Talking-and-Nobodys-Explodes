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
public class EnigmaPredicados extends Enigma {
	private String Predicade;
	
	public String getPredicade() {
		return Predicade;
	}

	public void setPredicade(String predicade) {
		Predicade = predicade;
	}

	@Override
	public void puzzleType() {
		if(this.getPuzzleValue() == 1) {
			this.setPredicade("Predicade");
		}
		
	}

}
