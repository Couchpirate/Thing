
public class Cleric extends CharacterClass {

	ManaResource mr = new ManaResource();
	static int cleMnd;
	
	public Cleric(int inputHealth, int inputStrength, int inputIntellect, int inputDex, int inputMind){
		super("Cleric", inputHealth, inputStrength, inputIntellect, inputDex, (inputMind + cleMnd));
		
		
		
	}
	
}