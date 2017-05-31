

public class Archer extends CharacterClass {

	EnergyResource er = new EnergyResource();
	static int arcDex = 1;
	
	public Archer(int inputHealth, int inputStrength, int inputIntellect, int inputDex, int inputMind){
		super("Archer", inputHealth, inputStrength, inputIntellect, (inputDex + arcDex), inputMind );
		
		
		
	}
	
}