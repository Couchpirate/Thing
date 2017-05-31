

public class Sorcerer extends CharacterClass {

	ManaResource mr = new ManaResource();
	static int sorcInt;
	
	public Sorcerer(int inputHealth, int inputStrength, int inputIntellect, int inputDex, int inputMind){
		super("Sorcerer", inputHealth, inputStrength, (inputIntellect + sorcInt), inputDex, inputMind );
		
		
		
	}
	
}
