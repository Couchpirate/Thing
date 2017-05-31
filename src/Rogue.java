
public class Rogue extends CharacterClass {

	EnergyResource er = new EnergyResource();
	static int rogDex = 1;
	
	public Rogue(int inputHealth, int inputStrength, int inputIntellect, int inputDex, int inputMind){
		super("Rogue", inputHealth, inputStrength, inputIntellect, (inputDex + rogDex), inputMind );
		
		
		
	}
	
}
