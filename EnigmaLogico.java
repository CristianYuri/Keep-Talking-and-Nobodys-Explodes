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
public class EnigmaLogico extends Enigma {
	private String Logic;
	
	
	public String getLogic() {
		return Logic;
	}


	public void setLogic(String logic) {
		Logic = logic;
	}


	@Override
	public void puzzleType() {
		if(this.getPuzzleValue() == 0) {
			this.setLogic("Logico");
		}
		
	}

}
