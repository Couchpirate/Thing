
public class Warrior extends CharacterClass {

	RageResource rr = new RageResource();
	static int warStr = 1;
	
	public Warrior(int inputHealth, int inputStrength, int inputIntellect, int inputDex, int inputMind){
		super("Warrior", inputHealth, (inputStrength + warStr), inputIntellect, inputDex, inputMind );
		
		
		
	}
	
}
