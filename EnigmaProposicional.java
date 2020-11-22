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
public class EnigmaProposicional extends Enigma {
	private String Propositional;
	
	public String getPropositional() {
		return Propositional;
	}

	public void setPropositional(String propositional) {
		Propositional = propositional;
	}

	@Override
	public void puzzleType() {
		if(this.getPuzzleValue() == 2) {
			this.setPropositional("Propositional");
		}
		
	}

}
